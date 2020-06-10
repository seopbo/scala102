package scala.learning.five.example
// 05-4. 자리표시자 구문 예제
object Example13 extends App {
  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }
  println(safeStringOp(null, _.reverse))
}
