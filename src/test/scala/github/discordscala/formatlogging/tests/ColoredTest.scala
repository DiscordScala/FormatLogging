package github.discordscala.formatlogging.tests

import org.scalatest._
import github.discordscala.formatlogging.Colored

class ColoredTest extends FlatSpec with Matchers {

  "A colored formatter" should "format errors correctly" in {
    error"This is an error" should be ("\u001B[31m[ERROR]\u001B[0m This is an error")
    error"${1 + 1}" should be ("\u001B[31m[ERROR]\u001B[0m 2")

    val i = 3
    error"${i + 1}" should be ("\u001B[31m[ERROR]\u001B[0m 4")

    val hello = "hello"
    error"$hello World" should be ("\u001B[31m[ERROR]\u001B[0m hello World")
  }

  it should "format warnings correctly" in {
    warn"This is a warning" should be ("\u001B[33m[WARN]\u001B[0m  This is a warning")
    warn"${1 + 1}" should be ("\u001B[33m[WARN]\u001B[0m  2")

    val i = 3
    warn"${i + 1}" should be ("\u001B[33m[WARN]\u001B[0m  4")

    val hello = "hello"
    warn"$hello World" should be ("\u001B[33m[WARN]\u001B[0m  hello World")
  }

  it should "format infos correctly" in {
    info"This is an info" should be ("\u001B[37m[INFO]\u001B[0m  This is an info")
    info"${1 + 1}" should be ("\u001B[37m[INFO]\u001B[0m  2")

    val i = 3
    info"${i + 1}" should be ("\u001B[37m[INFO]\u001B[0m  4")

    val hello = "hello"
    info"$hello World" should be ("\u001B[37m[INFO]\u001B[0m  hello World")
  }

  it should "format debugs correctly" in {
    debug"This is a debug" should be ("\u001B[36m[DEBUG]\u001B[0m This is a debug")
    debug"${1 + 1}" should be ("\u001B[36m[DEBUG]\u001B[0m 2")

    val i = 3
    debug"${i + 1}" should be ("\u001B[36m[DEBUG]\u001B[0m 4")

    val hello = "hello"
    debug"$hello World" should be ("\u001B[36m[DEBUG]\u001B[0m hello World")
  }

  it should "format traces correctly" in {
    trace"This is a trace" should be ("\u001B[35m[TRACE]\u001B[0m This is a trace")
    trace"${1 + 1}" should be ("\u001B[35m[TRACE]\u001B[0m 2")

    val i = 3
    trace"${i + 1}" should be ("\u001B[35m[TRACE]\u001B[0m 4")

    val hello = "hello"
    trace"$hello World" should be ("\u001B[35m[TRACE]\u001B[0m hello World")
  }


  it should "pass the formatting demo without any exceptions" in {
    println(error"Formatting demo")
    println(warn"Formatting demo")
    println(info"Formatting demo")
    println(debug"Formatting demo")
    println(trace"Formatting demo")
  }

}
