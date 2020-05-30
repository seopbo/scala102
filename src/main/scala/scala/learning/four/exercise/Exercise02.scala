package scala.learning.four.exercise
import scala.io.StdIn.readLine
import scala.math.Pi

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println(calculateCircleArea(readLine))
  }

  def calculateCircleArea(radius: String): Double = {
    radius.isEmpty match {
      case true => 0
      case false => radius.toFloat * Pi
    }
  }
}
