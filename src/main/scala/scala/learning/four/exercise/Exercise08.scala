package scala.learning.four.exercise

object Exercise08 {
  def main(args: Array[String]): Unit = {
    val testValue = (true, 22.25, "yes")
    println(stringify(testValue))

  }

  def stringify[A,B,C](t: (A,B,C)): (A,String,B,String,C,String) = {
    (t._1, t._1.toString, t._2, t._2.toString, t._3, t._3.toString)
  }
}
