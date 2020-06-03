package scala.learning.four.example
// 04-0. 개요> 함수 정의하기 예
object Example03 {
  def main(args: Array[String]): Unit = {
    def multiplier(x: Int, y: Int): Int = {x * y}
    println(multiplier(6, 7))
  }
}
