package scala.learning.five.example
// 05-3. 함수 리터럴 작성하기 예제
object Example09 extends App {
  def max(a: Int, b: Int) = if (a > b) a else b // 원본 함수
  val maximize1: (Int, Int) => Int = max // 함수 값에 할당됨
  val maximize2 = (a: Int, b: Int) => if (a > b) a else b // 함수 리터럴로 정의됨
  println(max(84, 96))
  println(maximize1(84, 96))
  println(maximize2(84, 96))
}
