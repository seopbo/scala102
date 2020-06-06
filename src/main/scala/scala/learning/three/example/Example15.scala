package scala.learning.three.example
// 03-4. 루프: 중첩된 반복자 예제
object Example15 extends App {
  for (x <- 1 to 2; y <- 1 to 3) println(s"($x, $y)")
}
