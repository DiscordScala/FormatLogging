package github.discordscala.formatlogging.tests

import org.scalatest._
import github.discordscala.formatlogging.Colored

class ColoredTest extends FlatSpec with Matchers {
  "A colored formatter" should "format errors correctly" in {
    error"This is an error" should be ("\u001B[31m[ERROR]\u001B[30m This is an error")
    error"${1 + 1}" should be ("\u001B[31m[ERROR]\u001B[30m 2")

    val i = 3
    error"${i + 1}" should be ("\u001B[31m[ERROR]\u001B[30m 4")

    val hello = "hello"
    error"$hello World" should be ("\u001B[31m[ERROR]\u001B[30m Hello World")
  }

}
