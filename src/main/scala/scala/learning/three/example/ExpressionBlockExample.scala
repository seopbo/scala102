package scala.learning.three.example

object ExpressionBlockExample extends App {
  val amount = {
    val x = 5 * 20
    x + 10
  }
  println(amount)
}
