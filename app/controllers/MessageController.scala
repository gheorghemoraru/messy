package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.libs.json.Json
import models._
import dal._

import scala.concurrent.{ ExecutionContext, Future }

import javax.inject._

class MessageController @Inject() (repo: MessageRepository, val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport{

  /**
   * The mapping for the message form.
   */
  val messageForm: Form[CreateMessageForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "body" -> nonEmptyText
    )(CreateMessageForm.apply)(CreateMessageForm.unapply)
  }

  /**
   * The index action.
   */
  def index = Action {
    Ok(views.html.index(messageForm))
  }

  /**
   * The add message action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on MessageRepository.
   */
  def addMessage = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    messageForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the message creation function returns a future.
      errorForm => {
        Future.successful(Ok(views.html.index(errorForm)))
      },
      // There were no errors in the from, so create the message.
      message => {
        repo.create(message.name, message.body).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.MessageController.index)
        }
      }
    )
  }

  /**
   * A REST endpoint that gets all the messages as JSON.
   */
  def getMessages = Action.async {
  	repo.list().map { messages =>
      Ok(Json.toJson(messages))
    }
  }
}

/**
 * The create person form.
 *
 * Generally for forms, you should define separate objects to your models, since forms very often need to present data
 * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
 * that is generated once it's created.
 */
case class CreateMessageForm(name: String, body: String)
