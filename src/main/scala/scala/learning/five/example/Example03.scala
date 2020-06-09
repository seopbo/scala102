package scala.learning.five.example
// 05-1. 함수 타입 예제
object Example03 extends App {
  def max(a: Int, b: Int) = if (a > b) a else b
  val maximize: (Int, Int) => Int = max
  println(maximize(50, 30))
}
