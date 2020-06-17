package scala.learning.six.example
// 06-7. 컬렉션으로 패턴 매칭하기 예제 (컬렉션은 아니지만 튜플도 패턴 매칭과 값 바인딩을 지원함.)
object Example24 extends App {
  val code = ("h", 204, true) match {
    case (_, _, false) => 501
    case ("c", _, true) => 302
    case ("h", x, true) => x
    case (c, x, true) => {
      println(s"Did not expect code $c")
      x
    }
  }
  println(code)
}
