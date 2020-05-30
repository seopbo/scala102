package scala.learning.two.exercise
import scala.io.StdIn.readDouble

object Exercise02 extends App {
  // 2. 섭씨-화씨 전환 수식을 변경하여 부동 소수점 숫자 대신 정수를 반환하도록 만들자.
  val celsisus = readDouble
  val fahrenheit = (celsisus * (9.0 / 5.0) + 32).toInt
  println(fahrenheit)
}
