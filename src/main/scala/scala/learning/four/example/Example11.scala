package scala.learning.four.example
// 04-6. 이름으로 매개변수를 지정하여 함수 호출하기
object Example11 extends App {
  def greet(prefix: String, name: String) = s"$prefix $name"
  println(greet("Ms", "Brown"))
  println(greet(name="Brown", prefix="Ms"))
}
