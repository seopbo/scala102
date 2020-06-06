package scala.learning.two.example
// 02-4. 타입: 튜플 생성 예제
object Example12 extends App {
  val info = (5, "Korben", true)
  val name = info._2

  println(name)
  // -> 연산자를 사용해서도 튜플을 생성 가능
  val red = "red" -> 0xff0000
  val reversed = red._2 -> red._1

  println(red)
  println(reversed)
}
