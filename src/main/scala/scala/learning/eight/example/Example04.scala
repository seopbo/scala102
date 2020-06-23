package scala.learning.eight.example
// 08-0. 개요: user class 재설계, 필드 중 하나를 매개변수로 선언하기
class User04(val name: String) {
  def greet: String = s"Hello from $name"
  override def toString: String = s"User($name)"
}

object Example04 extends App {
  val users = List(new User04("Shoto"), new User04("Art3mis"), new User04("Aesch"))
  val sizes = users map (_.name.size)
  val sorted = users.sortBy(_.name)
  val third = users.find(x => x.name.contains("3"))
  val greet = third.map(_.greet).getOrElse("hi")

  println(users)
  println(sizes)
  println(sorted)
  println(third)
  println(greet)
}
