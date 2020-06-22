package scala.learning.seven.example
// 07-4. 스트림 예제
object Example08 extends App {
  // 새로운 스트림을 구성하고 재귀적으로 생성하는 함수
  /*
    시작 정수값을 하나씩 증가시키면서 연속적으로 증가하는 정수의 컬렉션을 생성함.
   */
  def inc(i : Int): Stream[Int] = Stream.cons(i, inc(i + 1))
  val s = inc(1)
  println(s)
  val l = s.take(5).toList
  println(l)
  println(s)
}
