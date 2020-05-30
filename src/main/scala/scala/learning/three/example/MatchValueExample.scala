package scala.learning.three.example

object MatchValueExample extends App {
  val status = 500
  val message = status match {
    case 200 => "ok"
    case 400 => {
      println("ERROR - we called the service incorrectly")
      "error"
    }
    case 500 => {
      println("ERROR - the service encountered an error")
      "error"
    }
  }
}
