package scala.learning.nine.example
// 09-1. 객체: apply 메소드와 동반객체 예제
// apply 메소드가 클래스의 팩토리 메소드 역할을 하는 경우
object Example03 extends App {
  val tripler = Multiplier(3)
  val result = tripler.product(13)
  println(result)
}

class Multiplier(val x: Int) {
  def product(y: Int) = x * y
}

object Multiplier {
  def apply(x: Int) = new Multiplier(x)
}