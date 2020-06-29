package scala.learning.eight.example
// 08-4. 패키징된 클래스에 접근하기: 임포트 별칭 사용하기 예제
import scala.collection.mutable.{Map => MutMap}

object Example22 extends App {
  val m1 = Map(1 -> 2)
  val m2 = MutMap(2 -> 3)
  println(m1.getClass, m2.getClass)
}
