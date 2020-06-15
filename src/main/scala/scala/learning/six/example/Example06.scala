package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example06 extends App {
  val primes = List(2, 3, 5, 7, 11, 13)
  val first = primes(0)
  val fourth = primes(3)
  println(first, fourth)
}
