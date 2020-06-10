package scala.learning.five.example
// 05-4. 자리표시자 구문 예제
object Example12 extends App {
  val doubler: Int => Int = _ * 2
  println(doubler(2))
}
