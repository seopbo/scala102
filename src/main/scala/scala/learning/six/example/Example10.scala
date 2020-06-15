package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example10 extends App {
  val l: List[Int] = List()
  println(l == Nil)
  val m: List[String] = List("a")
  println(m.tail == Nil)
}
