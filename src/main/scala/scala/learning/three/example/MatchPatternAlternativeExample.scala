package scala.learning.three.example

object MatchPatternAlternativeExample extends App {
  val day = "MON"
  val kind = day match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
      "weekday"
    case "SAT" | "SUN" =>
      "weekend"
  }
}
