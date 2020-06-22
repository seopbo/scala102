package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Option 컬렉션 예제
object Example13 extends App {
  val odds = List(1, 3, 5)
  val firstOdd = odds.headOption
  println(firstOdd)
  println(odds.head)
  val evens = odds.filter(_ % 2 == 0)
  println(evens)
  val firstEven = evens.headOption
  println(firstEven)
}
