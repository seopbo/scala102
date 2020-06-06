package scala.learning.two.example
// 02-4. 타입: 타입 캐스팅 예제
object Example05 {
  def main(args: Array[String]): Unit = {
    val l: Long = 20
    val i: Int = l.toInt

    println(l.getClass)
    println(i.getClass)
  }
}
