package scala.learning.six.example
// 06-1. 리스트, 집합, 그리고 맵 예제
object Example01 extends App {
  val numbers = List(32, 95, 24, 21, 17)
  val colors = List("red", "green", "blue")
  println(numbers)
  println(s"I have ${colors.size} colors: $colors")
  println(colors.head, colors.tail, colors(0))
}
