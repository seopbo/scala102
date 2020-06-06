package scala.learning.three.example
// 03-4. 루프: 기본 for 루프로 반복하기 예제
object Example11 extends App {
  val data = for (x <- 1 to 7) {s"Day $x:"}
  println(data)
}
