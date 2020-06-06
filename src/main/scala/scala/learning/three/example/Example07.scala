package scala.learning.three.example
// 03-3. 매치표현식: 값 바인딩 패턴 예제
object Example07 extends App {
  val message = "OK"
  val status = message match {
    case "OK" => 200
    // 아래에서 값 other는 case 블록이 유지되는 동안 정의되며, 매치 표현식의 입력값인 message의 값이 할당됨.
    case other => {
      println(s"Couldn't parse $other")
      -1
    }
  }
  println(status)
}
