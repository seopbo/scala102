package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Try 컬렉션 예제
object Example18 extends App {
  val input = " 123 "
  val result = util.Try(input.toInt) orElse util.Try(input.trim.toInt)
  result foreach (r => println(s"""Parse "${input}" to $r!"""))

  val x = result match {
    case util.Success(x) => Some(x)
    case util.Failure(error) => {
      println(s"""Couldn't parse input "$input" """)
      None
    }
  }
  println(x)
}
