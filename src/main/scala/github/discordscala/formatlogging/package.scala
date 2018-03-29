package github.discordscala

package object formatlogging {

  implicit class LogContext(private val sc: StringContext) {
    def error(args: Any*): String = {
      "\u001B[31m[ERROR]\u001B[30m " + Common.interpolate(sc.parts, args)
    }
  }

}
