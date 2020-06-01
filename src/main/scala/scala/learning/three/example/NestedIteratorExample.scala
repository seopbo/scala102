package scala.learning.three.example

object NestedIteratorExample extends App {
  for (x <- 1 to 2; y <- 1 to 3) println(s"($x, $y)")
}
