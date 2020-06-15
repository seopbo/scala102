package scala.learning.six.example
// 06-1. 리스트, 집합, 그리고 맵 예제
object Example03 extends App {
  val unique = Set(10, 20, 30, 20, 20, 10)
  val sum = unique.reduce((a: Int, b: Int) => a + b)
  println(unique)
  println(sum)
}
