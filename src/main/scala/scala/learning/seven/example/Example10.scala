package scala.learning.seven.example
// 07-4. 스트림 예제
object Example10 extends App {
  def to(head: Char, end: Char): Stream[Char] = (head > end) match {
    case true => Stream.empty
    case false => head #:: to((head + 1).toChar, end)
  }
  val hexChars = to('A', 'F').take(20).toList
  println(hexChars)
}
