package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example11 extends App {
  val primes = List(2, 3, 5, 7, 11, 13)
  var i = primes
  while (i != Nil) {
    print(i.head + ", ")
    i = i.tail
  }
}
