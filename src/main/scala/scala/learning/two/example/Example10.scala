package scala.learning.two.example
// 02-4. 타입: 스칼라 타입의 개요 예제
object Example10 extends App {
  val c = 'A'
  val i: Int = c
  val t: Char = 116

  println(c, c.getClass)
  println(i, i.getClass)
  println(t, t.getClass)
}
