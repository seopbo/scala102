package scala.learning.two.example

object TypeCastingExample {
  def main(args: Array[String]): Unit = {
    val l: Long = 20
    val i: Int = l.toInt

    println(l.getClass)
    println(i.getClass)
  }
}
