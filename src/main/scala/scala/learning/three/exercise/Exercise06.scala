package scala.learning.three.exercise

object Exercise06 extends App {
  for (i <- 1 to 100) if (i % 5 == 0) print(i +",\n") else print(i + ", ")
}
