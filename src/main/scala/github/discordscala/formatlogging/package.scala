package github.discordscala

package object formatlogging {

  implicit class Colored(private val sc: StringContext) {
    def error(args: Any*): String = {
      "\u001B[31m[ERROR]\u001B[30m " + Common.interpolate(sc.parts, args)
    }
  }

  implicit class Monochrome(private val sc: StringContext) {
    def error(args: Any*): String = {
      "[ERROR] " + Common.interpolate(sc.parts, args)
    }
  }

}
