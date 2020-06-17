package scala.learning.six.example
// 06-5. 리스트 축소하기 예제
object Example20 extends App {
  val included = List(46, 19, 92).foldLeft(false) {(a, i) => if (a) a else (i == 19)}
  val answer = List(11.3, 23.5, 7.2).reduceLeft(_ + _)
  println(included)
  println(answer)
}
