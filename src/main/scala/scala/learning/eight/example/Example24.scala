package scala.learning.eight.example
// 08-4. 프라이버시 제어: private
class User24(private var password: String) {
  def update(p: String) = {
    println("Modifying the password!")
    password = p
  }

  def validate(p: String) = p == password
}

object Example24 extends App {
  val u = new User24("1234")
  var isValid = u.validate("4567")
  u.update("4567")
  isValid = u.validate("4567")
  println(isValid)
}
