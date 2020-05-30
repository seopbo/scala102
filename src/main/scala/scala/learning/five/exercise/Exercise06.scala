package scala.learning.five.exercise

object Exercise06 {
  def main(args: Array[String]): Unit = {
    val a = conditional[String]("yo", _.contains("y"), _.reverse)
    println(a)
  }

  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }
}
