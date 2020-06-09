package scala.learning.five.example
// 05-2. 고차 함수 예
object Example06 extends App {
  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }
  val reverse = (s: String) => s.reverse
  println(safeStringOp("ready", reverse))
}
