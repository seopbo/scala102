package scala.learning.seven.example
// 07-1. 가변적인 컬렉션: 컬렉션 빌더 사용하기 예제
object Example04 extends App {
  val b = Set.newBuilder[Char]
  println(b, b.getClass)

  b += 'h'
  println(b)
  b ++= List('e', 'l', 'l', 'o')
  println(b)
  val helloSet = b.result
  println(helloSet, helloSet.getClass)
}
