package scala.learning.six.example
// 06-5. 리스트 축소하기 예제
object Example19 extends App {
  def reduceOp[A, B](l: List[A], start: B)(f: (B, A) => B): B = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }
  val included = reduceOp(List(46, 19, 92), false) {(a, i) => if (a) a else (i == 19)}
  println(included)
  val answer = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)
  println(answer)
}

