
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/maithili/Desktop/final-ob/ms-mongodb/conf/app.routes
// @DATE:Tue May 10 19:27:30 BST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseMongoService(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MongoService.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:2
    def getUserByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MongoService.getUserByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserByName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:1
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MongoService.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllUsers"})
        }
      """
    )
  
    // @LINE:4
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MongoService.deleteUser",
      """
        function(name0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
  }


}
