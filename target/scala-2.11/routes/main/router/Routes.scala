
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ggx/projects/messy/conf/routes
// @DATE:Sun Dec 20 23:24:11 CET 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  MessageController_0: controllers.MessageController,
  // @LINE:11
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    MessageController_0: controllers.MessageController,
    // @LINE:11
    Assets_1: controllers.Assets
  ) = this(errorHandler, MessageController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MessageController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MessageController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.MessageController.addMessage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages""", """controllers.MessageController.getMessages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_MessageController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MessageController_index0_invoker = createInvoker(
    MessageController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_MessageController_addMessage1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_MessageController_addMessage1_invoker = createInvoker(
    MessageController_0.addMessage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "addMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """message"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MessageController_getMessages2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages")))
  )
  private[this] lazy val controllers_MessageController_getMessages2_invoker = createInvoker(
    MessageController_0.getMessages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "getMessages",
      Nil,
      "GET",
      """""",
      this.prefix + """messages"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_MessageController_index0_route(params) =>
      call { 
        controllers_MessageController_index0_invoker.call(MessageController_0.index)
      }
  
    // @LINE:7
    case controllers_MessageController_addMessage1_route(params) =>
      call { 
        controllers_MessageController_addMessage1_invoker.call(MessageController_0.addMessage)
      }
  
    // @LINE:8
    case controllers_MessageController_getMessages2_route(params) =>
      call { 
        controllers_MessageController_getMessages2_invoker.call(MessageController_0.getMessages)
      }
  
    // @LINE:11
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  }
}