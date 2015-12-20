package dal

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.driver.JdbcProfile

import models.Message

import scala.concurrent.{ Future, ExecutionContext }

/**
 * A repository for people.
 *
 * @param dbConfigProvider The Play db config provider. Play will inject this for you.
 */
@Singleton
class MessageRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import driver.api._

  /**
   * Here we define the table. It will have a name of messages
   */
  private class MessagesTable(tag: Tag) extends Table[Message](tag, "messages") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The body column */
    def body = column[String]("body")

    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Message object.
     *
     * In this case, we are simply passing the id, name and body parameters to the Message case classes
     * apply and unapply methods.
     */
    def * = (id, name, body) <> ((Message.apply _).tupled, Message.unapply)
  }

  /**
   * The starting point for all queries on the messages table.
   */
  private val messages = TableQuery[MessagesTable]

  /**
   * Create a message with the given name and body.
   *
   * This is an asynchronous operation, it will return a future of the created message, which can be used to obtain the
   * id for that message.
   */
  def create(name: String, body: String): Future[Message] = db.run {
    // We create a projection of just the name and body columns, since we're not inserting a value for the id column
    (messages.map(m => (m.name, m.body))
      // Now define it to return the id, because we want to know what id was generated for the message
      returning messages.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into ((nameBody, id) => Message(id, nameBody._1, nameBody._2))
    // And finally, insert the message into the database
    ) += (name, body)
  }

  /**
   * List all the messages in the database.
   */
  def list(): Future[Seq[Message]] = db.run {
    messages.result
  }
}
