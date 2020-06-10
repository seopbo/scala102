package scala.learning.five.example
// 05-6. 이름에 의한 호출 매개변수 예제
object Example18 extends App {
  def doubles(x: => Int) = {
    println("Now doubling " + x)
    x * 2
  }
  println(doubles(5))

  def f(i: Int) = {println(s"Hello from f($i)"); i}
  doubles(f(8))
}
