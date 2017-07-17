
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/maithili/Desktop/final-ob/ms-mongodb/conf/app.routes
// @DATE:Tue May 10 19:27:30 BST 2016

package app

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  MongoService_1: controllers.MongoService,
  // @LINE:7
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    MongoService_1: controllers.MongoService,
    // @LINE:7
    Assets_0: controllers.Assets
  ) = this(errorHandler, MongoService_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    app.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MongoService_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllUsers""", """controllers.MongoService.getAllUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserByName/""" + "$" + """name<[^/]+>""", """controllers.MongoService.getUserByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.MongoService.addUser"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """name<[^/]+>""", """controllers.MongoService.deleteUser(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_MongoService_getAllUsers0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllUsers")))
  )
  private[this] lazy val controllers_MongoService_getAllUsers0_invoker = createInvoker(
    MongoService_1.getAllUsers,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MongoService",
      "getAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllUsers"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_MongoService_getUserByName1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserByName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MongoService_getUserByName1_invoker = createInvoker(
    MongoService_1.getUserByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MongoService",
      "getUserByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getUserByName/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_MongoService_addUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_MongoService_addUser2_invoker = createInvoker(
    MongoService_1.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MongoService",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """addUser"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_MongoService_deleteUser3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MongoService_deleteUser3_invoker = createInvoker(
    MongoService_1.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MongoService",
      "deleteUser",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """deleteUser/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_MongoService_getAllUsers0_route(params) =>
      call { 
        controllers_MongoService_getAllUsers0_invoker.call(MongoService_1.getAllUsers)
      }
  
    // @LINE:2
    case controllers_MongoService_getUserByName1_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_MongoService_getUserByName1_invoker.call(MongoService_1.getUserByName(name))
      }
  
    // @LINE:3
    case controllers_MongoService_addUser2_route(params) =>
      call { 
        controllers_MongoService_addUser2_invoker.call(MongoService_1.addUser)
      }
  
    // @LINE:4
    case controllers_MongoService_deleteUser3_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_MongoService_deleteUser3_invoker.call(MongoService_1.deleteUser(name))
      }
  
    // @LINE:7
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
