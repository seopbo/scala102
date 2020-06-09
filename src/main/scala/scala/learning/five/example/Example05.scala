package scala.learning.five.example
// 05-1. 함수 타입 예
object Example05 extends App {
  def logStart() = "=" * 50 + "\nStarting Now\n" + "=" * 50
  val start: () => String = logStart
  println(start())
}
