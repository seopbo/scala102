package scala.learning.eight.example
// 08-1. 클래스 정의하기: 입력 매개변수로 클래스정의하기 예제
class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean) = {reserved = r}

}

object Example07 extends App {
  val t = new Car("Toyota", false)
  println(t.reserved)
  t.reserve(true)
  println(s"My ${t.make} is now reserved? ${t.reserved}")
  val t2 = new Car(reserved = false, make = "Tesla")
}
