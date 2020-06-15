package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example09 extends App {
  def visit(i: List[Int]): Unit = {
    if (i.isEmpty) {
      return
    }
    print(i.head + ", ")
    visit(i.tail)
  }
  val primes = List(2, 3, 5, 7, 11, 13)
  visit(primes)
}
