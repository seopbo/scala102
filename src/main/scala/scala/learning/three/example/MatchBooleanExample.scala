package scala.learning.three.example

object MatchBooleanExample extends App {
  val x = 10; val y = 20
  val max = x > y match {
    case true => x
    case false => y
  }
  println(max)
}
