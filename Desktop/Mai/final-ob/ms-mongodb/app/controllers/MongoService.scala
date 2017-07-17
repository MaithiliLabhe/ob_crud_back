package controllers

import javax.inject.Inject

import play.api.mvc._
import play.api.mvc.Controller
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.functional.syntax._
import play.modules.reactivemongo.json.BSONFormats._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import reactivemongo.api.Cursor
import reactivemongo.play.json._
import models.User
import scala.concurrent.Future

class MongoService @Inject()(val reactiveMongoApi: ReactiveMongoApi)
  extends Controller with MongoController with ReactiveMongoComponents  {

  def collection: JSONCollection = db.collection[JSONCollection]("users")

  implicit val modelFormat = Json.format[User]

  def addUser = Action { implicit request =>

    val jsonBody: Option[JsValue] = request.body.asJson
    jsonBody.map { json =>
      val person = json.validate[User]
      person.fold( errors => {
        BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toJson(errors)))
      },
        person => {
          collection.insert(person) map {
            lastError =>
              Created
          }
          Ok(Json.obj("status" ->"OK", "message" -> ("User added into the system") ))
        })
    }.getOrElse(BadRequest(Json.obj("status" ->"KO")))
  }

  def getAllUsers = Action.async{
    val cursor: Cursor[User] = collection.find(Json.obj()).cursor[User]
    val futureUsersList: Future[Seq[User]] = cursor.collect[Seq]()
    futureUsersList.map(response => Ok(Json.toJson(response)))
  }

  def getUserByName(name: String) = Action.async { implicit request =>
    val cursor: Cursor[User] = collection.find(
      Json.obj("name" -> Json.obj("$regex" -> (".*" + name + ".*"), "$options" -> "-i")
      )).cursor[User]

    val futureUsersList: Future[Seq[User]] = cursor.collect[Seq]()
    futureUsersList.map(response => Ok(Json.toJson(response)))
  }

  def deleteUser(name: String) = Action.async { implicit request =>
    collection.remove(Json.obj("name" -> name), firstMatchOnly = true) map {
      returnedVal =>
        Ok(Json.obj("status" ->"OK", "message" -> ("User deleted from the system") ))
    }
  }
}
