package scala.learning.five.example
// 05-8. 함수 리터럴 블록으로 고차 함수 호출하기
object Example20 extends App {
  def safeStringOp(s: String)(f: String => String) = {
    if (s != null) f(s) else s
  }
  val uuid = java.util.UUID.randomUUID.toString
  val timedUUID = safeStringOp(uuid) {(s: String) =>
    val now = System.currentTimeMillis
    val timed = s.take(24) + now
    timed.toUpperCase
  }
  println(timedUUID)
}
