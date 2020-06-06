package scala.learning.two.example
// 02-4. 타입: 스칼라 타입의 개요 예제
object Example11 extends App {
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
