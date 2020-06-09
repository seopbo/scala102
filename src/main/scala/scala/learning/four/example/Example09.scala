package scala.learning.four.example
// 04-4. 재귀함수: 꼬리-재귀 예제
object Example09 extends App {
  @annotation.tailrec
  def power(x: Int, n: Int, t: Int = 1): Int = {
    if (n < 1) t else power(x, n-1, x*t)
  }
  println(power(2, 8))
}
