package scala.learning.six.example
// 06-3. 리스트 산술연산 예제
object Example13 extends App {
  val f = List(23, 8, 14, 21).filter(_ > 18)
  val p = List(1, 2, 3, 4, 5).partition(_ < 3)
  val s = List("apple", "to").sortBy(_.size)
  println(f)
  println(p)
  println(s)
}
