package scala.learning.five.example
// 05-3. 함수 리터럴 작성하기 예제
object Example08 extends App {
  val greeter = (name: String) => s"Hello, $name"
  val hi = greeter("World")
  println(hi)
}
