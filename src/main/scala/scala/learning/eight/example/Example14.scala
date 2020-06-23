package scala.learning.eight.example
// 08-3. 그 외의 필드와 메소드 유형: 중복 정의된 메소드
class Printer(msg: String) {
  def print(s: String) = println(s"$msg: $s")
  def print(l: Seq[String]) = println(l.mkString(". "))
}

object Example14 extends App {
  new Printer("Today's Report").print("Foggy" :: "Rainy" :: "Hot" :: Nil)
}
