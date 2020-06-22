package scala.learning.seven.example
// 07-1. 가변적인 컬렉션: 새로운 가변 컬렉션 생성하기 예제
object Example01 extends App {
  val nums = scala.collection.mutable.Buffer(1)
  for (i <- 2 to 10) {
    nums += i
  }
  println(nums)
  val l = nums.toList // 불변의 리스트로 전환
  println(l, l.getClass)
}
