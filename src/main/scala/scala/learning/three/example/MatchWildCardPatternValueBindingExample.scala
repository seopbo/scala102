package scala.learning.three.example

object MatchWildCardPatternValueBindingExample extends App {
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
