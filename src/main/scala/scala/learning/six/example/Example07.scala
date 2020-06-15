package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example07 extends App {
  val primes = List(2, 3, 5, 7, 11, 13)
  val first = primes.head
  val remaining = primes.tail
  println(first)
  println(remaining)
}
