package scala.learning.three.example
// 03-3. 매치표현식: 패턴 가드 예제
object Example09 extends App {
  val response: String = null
  response match {
    case s if s != null => println(s"Received $s")
    case s => println("Error! Received a null response")
  }
  println(response)
}
