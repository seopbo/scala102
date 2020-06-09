package scala.learning.five.example
// 05-1. 함수 타입 예제
object Example01 extends App {
  def double(x: Int): Int = x * 2
  val myDouble: (Int) => (Int) = double // myDouble의 명시적 타입은 이를 함수 호출이 아닌 함수 리터럴로 식별하는 데 필요
  val myDoubleCopy = myDouble
  println(double(5))
  println(myDouble(5), myDouble.getClass)
  println(myDoubleCopy(5), myDoubleCopy.getClass)
}
