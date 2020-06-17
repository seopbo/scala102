package scala.learning.six.example
// 06-7. 컬렉션으로 패턴 매칭하기 예제
object Example21 extends App {
  val statuses = List(500, 404)
  val msg = statuses match {
    case x if x contains(500) => "has error"
    case _ => "okay"
  }
  println(msg)
}
