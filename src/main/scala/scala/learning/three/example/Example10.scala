package scala.learning.three.example
// 03-3. 매치표현식: 패턴 변수 지정하기 예제
object Example10 extends App {
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
