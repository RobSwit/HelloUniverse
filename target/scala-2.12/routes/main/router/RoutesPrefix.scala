
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapp/HelloWorld/conf/routes
// @DATE:Thu Nov 09 13:48:51 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
