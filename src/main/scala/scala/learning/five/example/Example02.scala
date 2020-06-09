package scala.learning.five.example
// 05-1. 와일드카드 연산자로 함수 할당하기 예제
object Example02 extends App {
  def double(x: Int): Int = x * 2
  val myDouble = double _
  println(double(5))
  println(myDouble(5), myDouble.getClass)
}
