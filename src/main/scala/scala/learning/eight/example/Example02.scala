package scala.learning.eight.example
// 08-0. 개요: user class 재설계
class User02 {
  val name = "Yubaba"
  def greet: String = s"Hello from $name"
  override def toString = s"User($name)"
}

object Example02 extends App {
  val u = new User02
  println(u.greet)
  println(u)
}
