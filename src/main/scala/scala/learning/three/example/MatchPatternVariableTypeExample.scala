package scala.learning.three.example

object MatchPatternVariableTypeExample extends App {
  val x: Int = 12180
  val y: Any = x

  val realType = y match {
    case x: String => s"$x"
    case x: Double => f"$x%.2f"
    case x: Float => f"$x%.2f"
    case x: Long => s"${x}l"
    case x: Int => s"${x}i"
  }
  println(realType)
}
