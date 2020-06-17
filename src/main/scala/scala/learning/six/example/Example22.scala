package scala.learning.six.example
// 06-7. 컬렉션으로 패턴 매칭하기 예제 (값 바인딩 + 패턴 가드)
object Example22 extends App {
  val statuses = List(500, 404)
  val msg = statuses match {
    case List(500, x) => s"Error followed by $x"
    case List(e, x) => s"$e was followed by $x"
  }
  println(msg)
}
