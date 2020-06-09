package scala.learning.four.example
// 04-8. 가변 매개변수 예제
object Example13 extends App {
  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }
  println(sum(10, 20, 30))
}
