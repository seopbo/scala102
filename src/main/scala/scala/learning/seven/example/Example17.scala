package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Try 컬렉션 예제
object Example17 extends App {
  def nextError = util.Try {1 / util.Random.nextInt(2)}
  val x = nextError
  println(x)
  val y = nextError
  println(y)
}
