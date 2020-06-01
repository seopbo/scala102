package scala.learning.three.example

object ValueBindingExample extends App {
  val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
  println(powersOf2)
}
