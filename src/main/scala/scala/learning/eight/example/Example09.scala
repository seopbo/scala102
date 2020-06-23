package scala.learning.eight.example
// 08-1. 클래스 정의하기: 입력 매개변수와 기본값으로 클래스 정의하기
class CustomCar(val make: String, var reserved: Boolean = true,
          val year: Int = 2015) {
  override def toString = s"$year $make, reserved = $reserved"
}

object Example09 extends App {
  val a = new CustomCar("Acura")
  val l = new CustomCar("Lexus", year=2010)
  println(a)
  println(l)
}
