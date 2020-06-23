package scala.learning.eight.example
// 08-2. 그 외의 클래스 유형: 익명 클래스
abstract class Listener {def trigger}

object Example12 extends App {
  val myListener = new Listener {
    def trigger = println(s"Trigger at ${new java.util.Date}")
  }

  myListener.trigger
}
