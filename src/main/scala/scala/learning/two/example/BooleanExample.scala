package scala.learning.two.example

object BooleanExample extends App {
  val isTrue = !false
  val isFalse = !true
  val unequal = (5 != 6)
  val isLess = (5 < 6)
  val unequalAndLess = unequal & isLess
  val definitelyFalse = false && unequal
  val zero = 0
  val isValid = zero > 0

  println(isTrue, isFalse, unequal, isLess, unequalAndLess, definitelyFalse, isValid)
}
