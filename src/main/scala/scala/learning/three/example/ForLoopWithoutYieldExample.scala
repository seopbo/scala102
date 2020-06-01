package scala.learning.three.example

object ForLoopWithoutYieldExample extends App {
  val data = for (x <- 1 to 7) {s"Day $x:"}
  println(data)
}
