package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Option 컬렉션 예제
object Example15 extends App {
  def nextOption(): Option[Int] = {
    if (util.Random.nextInt > 0) Some(1) else None
  }
  for (i <- 1 to 5) println(nextOption.getOrElse(0))
}
