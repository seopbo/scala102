package scala.learning.five.example
// 05-4. 자리표시자 구문 예제
object Example15 extends App {
  def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a, b, c)
  println(tripleOp(23, 92, 14, _ * _ * _))
}
