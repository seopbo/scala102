package scala.learning.seven.example
// 07-1. 가변적인 컬렉션: 불변의 컬렉션으로부터 가변적인 컬렉션 만들기 예제
object Example03 extends App {
  val m = Map("AAPL" -> 597, "MSFT" -> 40)
  println(m, m.getClass)
  val b = m.toBuffer
  println(b, b.getClass)
  b.trimStart(1)
  println(b)
  b += ("GOOG" -> 521)
  println(b)
  b += ("GOOG" -> 521)
  println(b)
  val l = b.toList
  println(l, l.getClass)
  val s = b.toSet
  println(s, s.getClass)
}