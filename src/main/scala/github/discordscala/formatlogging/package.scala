package github.discordscala

package object formatlogging {

  implicit class Colored(private val sc: StringContext) {
    def error(args: Any*): String = {
      "\u001B[31m[ERROR]\u001B[0m " + Common.interpolate(sc.parts, args)
    }
    def warn(args: Any*): String = {
      "\u001B[33m[WARN]\u001B[0m  " + Common.interpolate(sc.parts, args)
    }
    def info(args: Any*): String = {
      "\u001B[37m[INFO]\u001B[0m  " + Common.interpolate(sc.parts, args)
    }
    def debug(args: Any*): String = {
      "\u001B[36m[DEBUG]\u001B[0m " + Common.interpolate(sc.parts, args)
    }
    def trace(args: Any*): String = {
      "\u001B[35m[TRACE]\u001B[0m " + Common.interpolate(sc.parts, args)
    }
  }

  implicit class Monochrome(private val sc: StringContext) {
    def error(args: Any*): String = {
      "[ERROR] " + Common.interpolate(sc.parts, args)
    }
    def warn(args: Any*): String = {
      "[WARN]  " + Common.interpolate(sc.parts, args)
    }
    def info(args: Any*): String = {
      "[INFO]  " + Common.interpolate(sc.parts, args)
    }
    def debug(args: Any*): String = {
      "[DEBUG] " + Common.interpolate(sc.parts, args)
    }
    def trace(args: Any*): String = {
      "[TRACE] " + Common.interpolate(sc.parts, args)
    }
  }

}
