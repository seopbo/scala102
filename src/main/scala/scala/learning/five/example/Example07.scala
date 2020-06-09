package scala.learning.five.example
// 05-3. 함수 리터럴 작성하기 예제
object Example07 extends App {
  val doubler = (x: Int) => x * 2
  val doubled = doubler(22)
  println(doubler.getClass)
  println(doubled)
}
