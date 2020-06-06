package scala.learning.three.example
// 03-1. 표현식: 표현식 블록 예제
object Example01 extends App {
  val amount = {
    val x = 5 * 20
    x + 10
  }
  println(amount)
}
