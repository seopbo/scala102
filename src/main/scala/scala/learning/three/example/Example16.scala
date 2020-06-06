package scala.learning.three.example
// 03-4. 루프: for 루프에서 값 바인딩 예
object Example16 extends App {
  val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
  println(powersOf2)
}
