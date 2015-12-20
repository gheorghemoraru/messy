
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ggx/projects/messy/conf/routes
// @DATE:Sun Dec 20 23:24:11 CET 2015


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
