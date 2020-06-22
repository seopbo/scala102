package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Option 컬렉션 예제
object Example12 extends App {
  def divide(amt: Double, divisor: Double): Option[Double] = {
    if (divisor == 0) None else Option(amt / divisor)
  }
  val legit = divide(5, 2)
  println(legit)
  val illegit = divide(3, 0)
  println(illegit)
}
