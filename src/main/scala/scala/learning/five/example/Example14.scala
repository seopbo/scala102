package scala.learning.five.example
// 05-4. 자리표시자 구문 예제
object Example14 extends App {
  def combination(x: Int, y: Int, f: (Int, Int) => Int) = {
    f(x, y)
  }
  println(combination(23, 12, _ * _))
}
