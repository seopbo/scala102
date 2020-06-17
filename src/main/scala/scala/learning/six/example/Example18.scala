package scala.learning.six.example
// 06-5. 리스트 축소하기 예제
object Example18 extends App {
  def boolReduce(l: List[Int], start: Boolean)(f: (Boolean, Int) => Boolean): Boolean = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }
  val included = boolReduce(List(46, 19, 92), false) {
    (a, i) => if (a) a else (i == 19)
  }
  println(included)
}
