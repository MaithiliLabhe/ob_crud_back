
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/maithili/Desktop/final-ob/ms-mongodb/conf/app.routes
// @DATE:Tue May 10 19:27:30 BST 2016


package app {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
