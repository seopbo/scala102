package scala.learning.six.example
// 06-1. 리스트, 집합, 그리고 맵 예제
object Example04 extends App {
  val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
  val redRGB = colorMap("red")
  println(redRGB)
  val cyanRGB = colorMap("green") | colorMap("blue")
  println(cyanRGB)
  val hasWhite = colorMap.contains("white")
  println(hasWhite)
  colorMap.foreach(x => println(x))
}
