package scala.learning.three.example

object MatchWildCardWildcardOperatorExample extends App {
  val message = "Unauthorized"
  val status = message match {
    case "Ok" => 200
    case _ => {
      println(s"Couldn't parse $message")
      -1
    }
  }
  println(status)
}
