package scala.learning.four.exercise

object Exercise06 {
  def main(args: Array[String]): Unit = {
    val src = (4, 4)
    val dest = (10, 10)
    println(offset(src, dest))
  }

  def offset(src: (Int, Int), dest: (Int, Int)): (Int, Int) = {
    (dest._1 - src._1, dest._2 - src._2)
  }
}
