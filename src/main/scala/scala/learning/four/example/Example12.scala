package scala.learning.four.example
// 04-7. 함수 매개변수로 기본값 지정하기 예제
object Example12 extends App {
  def greet(prefix: String = "", name: String) = s"$prefix $name"
  println(greet(name="Paul"))
}
