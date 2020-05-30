package scala.learning.three.example

object MatchPatternGuardExample extends App {
  val response: String = null
  response match {
    case s if s != null => println(s"Received $s")
    case s => println("Error! Received a null response")
  }
}
