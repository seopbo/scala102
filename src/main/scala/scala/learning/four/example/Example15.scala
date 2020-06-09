package scala.learning.four.example
// 04-10. 함수의 타입 매개변수 정의하기 예제
object Example15 extends App {
  def identify[T](a: T): T = a
  println(identify[String]("Hello"), identify[String]("Hello").getClass)
  println(identify("Hello"), identify("Hello").getClass)
  println(identify(2.717), identify(2.717).getClass)
}
