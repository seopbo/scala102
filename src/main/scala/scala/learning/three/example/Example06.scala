package scala.learning.three.example
// 03-3. 매치표현식: 패턴 대안 예제
object Example06 extends App {
  val day = "MON"
  val kind = day match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
      "weekday"
    case "SAT" | "SUN" =>
      "weekend"
  }
  println(kind)
}
