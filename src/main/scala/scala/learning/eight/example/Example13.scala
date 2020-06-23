package scala.learning.eight.example
// 08-2. 그 의 클래스 유형: 익명 클래스
abstract class ExampleListener {def trigger}

class ExampleListening {
  var listner: ExampleListener = null
  def register(l: ExampleListener) {listner = l}
  def sendNotification() {listner.trigger}
}

object Example13 extends App {
  val notification = new ExampleListening()
  notification.register(new ExampleListener {
    def trigger = println(s"Trigger at ${new java.util.Date}")
  })
  notification.sendNotification()
}
