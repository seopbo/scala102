package scala.learning.seven.example
// 07-2. 배열 예제
object Example05 extends App {
  val colors = Array("red", "green", "blue")
  println(colors, colors.getClass)
  colors(0) = "purple"
  for (color <- colors) println(color)
}
