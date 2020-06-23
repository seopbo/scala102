package scala.learning.eight.example
// 08-3. 그 외의 필드와 메소드 유형: apply 메소드
class Multiplier(factor: Int) {
  def apply(input: Int) = input * factor
}

object Example15 extends App {
  val tripleMe = new Multiplier(3)
  val tripled = tripleMe(10)
  println(tripled)
}
