package scala.learning.six.example
// 06-2. 리스트에는 무엇이 있는가? 예제
object Example12 extends App {
  val numbers = 1 :: 2 :: 3 :: Nil
  println(numbers)
  val first = Nil.::(1)
  println(first, first.tail == Nil)
  val second = 2 :: first
  println(second, second.tail == first)
}
