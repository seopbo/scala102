package scala.learning.four.example
// 04-5. 중첩함수 예제
object Example10 extends App {
  def max(a: Int, b: Int, c: Int) = {
    def max(x: Int, y: Int) = if (x > y) x else y
    max(a, max(b, c))
  }
  println(max(42, 181, 19))
}
