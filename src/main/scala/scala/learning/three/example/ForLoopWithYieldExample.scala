package scala.learning.three.example

object ForLoopWithYieldExample extends App {
  val data = for (x <- 1 to 7) yield {s"Day $x:"}
  println(data)
}
