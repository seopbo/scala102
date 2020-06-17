package scala.learning.six.example
// 06-7. 컬렉션으로 패턴 매칭하기 예제
object Example23 extends App {
  val head = List("r", "g", "b") match {
    case x :: xs => x
    case Nil => " "
  }
  println(head)
}
