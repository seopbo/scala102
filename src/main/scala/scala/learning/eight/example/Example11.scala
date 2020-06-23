package scala.learning.eight.example
// 08-2. 그 외의 클래스 유형: 추상 클래스
abstract class MyCar {
  val year: Int //
  val automatic: Boolean = true // 기본값을 추상 클래스에서 선언하면 재구현 필요성은 없음.
  def color: String
  def make = "Korea"
}

class RedMini(val year: Int) extends MyCar {
  def color = "Red"
}

object Example11 extends App {
  val m: MyCar = new RedMini(2020)
  println(m.year, m.automatic, m.color, m.make)
}
