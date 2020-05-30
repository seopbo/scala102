package scala.learning.five.exercise
import scala.util.Random.nextInt

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val max = (x: Int, y: Int) => if (x > y) x else y
    println(pickOne((nextInt, nextInt, nextInt), max))

  }
  def pickOne(triplet: (Int, Int, Int), f: (Int, Int) => Int): Int = {
    f(triplet._1, f(triplet._2, triplet._3))
  }
}
