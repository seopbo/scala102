package scala.learning.six.example
// 06-3. 리스트 산술연산 예제
object Example14 extends App {
  val appended = List(1, 2, 3, 4) :+ 5
  val suffix = appended.takeRight(3)
  val middle = suffix dropRight(2)
  println(appended)
  println(suffix)
  println(middle)
}
