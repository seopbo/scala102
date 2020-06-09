package scala.learning.four.example
// 04-4. 재귀함수
object Example08 extends App {
  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n - 1) else 1
  }
  println(power(2, 8))
}
