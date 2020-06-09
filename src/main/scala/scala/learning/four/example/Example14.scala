package scala.learning.four.example
// 04-9. 매개변수 그룹 예제
object Example14 extends App {
  def max(x: Int)(y: Int) = if (x > y) x else y
  println(max(20)(39))
}
