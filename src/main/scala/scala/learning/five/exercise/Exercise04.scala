package scala.learning.five.exercise

object Exercise04 {
  def main(args: Array[String]): Unit = {
    val testString = "Hello"
    fzero(testString)(println)
  }

  def fzero[A](x: A)(f: A => Unit): A = {
    f(x)
    x
  }
}
