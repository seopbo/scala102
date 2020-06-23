package scala.learning.eight.example
// 08-1. 클래스 정의하기: 입력 매개변수로 클래스정의하기 예제
/*
  새로운 서브클래스인 Lotus는 자신만의 새로운 필드인 color를 가지며, 부모 클래스인 Car를 초기화하기위해 필드가 아닌
  입력매개변수 reserved를 취함.
 */
class Lotus(val color: String, reserved: Boolean) extends Car("Lotus", reserved)

object Example08 extends App {
  val l = new Lotus("Silver", false)
  println(s"Requested a ${l.color} ${l.make}")
}
