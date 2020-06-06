package scala.learning.three.example
// 03-3. 매치 표현식: 매치표현식 사용하기 예제
object Example05 extends App {
  val status = 500
  val message = status match {
    case 200 => "ok"
    case 400 => {
      println("ERROR - we called the service incorrectly")
      "error"
    }
    case 500 => {
      println("ERROR - the service encountered an error")
      "error"
    }
  }
}
