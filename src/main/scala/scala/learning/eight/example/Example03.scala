package scala.learning.eight.example
// 08-0. 개요: user class 재설계, 매개변수로 필드 초기화하기
class User03(n: String) {
  val name = n // 매개변수로 필드 (클래스 내의 값과 변수)를 초기화
  def greet = s"Hello from $name"
  override def toString: String = s"User($name)"
}

object Example03 extends App {
  val u = new User03("Zeniba")
  println(u.greet)
}
