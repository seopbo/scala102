package scala.learning.five.example
// 05-4. 자리표시자 구문 예제
object Example16 extends App {
  def tripleOp[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)
  println(tripleOp[Int, Boolean](1, 2, 3, _ + _ == _))
}
