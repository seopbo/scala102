package scala.learning.eight.example
// 08-0. 개요: 가장 간단한 class, user
class User01

object Example01 extends App {
  val u = new User01
  val isAnyRef = u.isInstanceOf[AnyRef]
  println(u.toString) // 이를 출력하는 실제 메소드는 java.lang.object.toString, instance가 루트 타입으로 상속한 toString 메소드를 호출
  println(isAnyRef)
}

