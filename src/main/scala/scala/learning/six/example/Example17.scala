package scala.learning.six.example
// 06-5. 리스트 축소하기 예제
object Example17 extends App {
  def contains(x: Int, l: List[Int]): Boolean = {
    var a = false
    for (i <- l) {if (!a) a = (i == x)}
    a
  }
  val included = contains(19, List(46, 19, 92))
  println(included)
}
