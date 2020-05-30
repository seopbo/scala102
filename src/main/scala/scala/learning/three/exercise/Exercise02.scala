package scala.learning.three.exercise
import scala.io.StdIn.readDouble

object Exercise02 {
  def main(args: Array[String]): Unit = {

    val amount = readDouble
    println(checkAmount(amount))
  }

  def checkAmount(amount: Double): String = {
    amount match {
      case greater if amount > 0 => "greater"
      case same if amount == 0 => "same"
      case less if amount < 0 => "less"
    }
  }
}