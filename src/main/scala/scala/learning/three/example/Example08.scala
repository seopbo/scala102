package scala.learning.three.example
// 03-3. 매치표현식: 와일드카드 연산자 패턴 예제
object Example08 extends App {
  val message = "Unauthorized"
  val status = message match {
    case "Ok" => 200
    case _ => {
      println(s"Couldn't parse $message")
      -1
    }
  }
  println(status)
}
