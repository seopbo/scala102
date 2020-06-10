package scala.learning.five.example
// 05-5. 부분 적용 함수 커링 예제
object Example17 extends App {
  def factorOf1(x: Int, y: Int) = y % x == 0
  // 어떤 매개변수도 유지하지않고, 함수를 호출하고 싶은 경우 (사실상 원 함수를 호출하면됨.)
  val f = factorOf1 _
  println(f(7, 20))

  // 일부 매개변수를 유지하고 싶은 경우
  val multipleOf3 = factorOf1(3, _: Int) // (Int, Int) => Boolean => (3 (커링), Int) => Boolean
  println(multipleOf3(20))

  def factorOf2(x: Int)(y: Int) = y % x == 0
  val isEven = factorOf2(2) _ // Int => Int => Boolean -> 2 (커링) => Int => Boolean
  println(isEven(32))
}
