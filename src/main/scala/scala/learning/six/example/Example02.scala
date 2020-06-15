package scala.learning.six.example
// 06-1. 리스트, 집합, 그리고 맵 예제
object Example02 extends App {
  val colors = List("red", "green", "blue")
  colors.foreach(x => println(x))
  val sizes = colors.map((x: String) => x.size)
  println(sizes)
  val numbers = List(32, 95, 24, 21, 17)
  val total = numbers.reduce((a, b) => a + b)
  println(total)
}
