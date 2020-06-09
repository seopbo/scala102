package scala.learning.five.example
// 05-1. 와일드 카드 연산자로 함수 할당하기 예제
object Example04 extends App {
  def max(a: Int, b: Int) = if (a > b) a else b
  val maximize = max _
  println(maximize(50, 30))
}
