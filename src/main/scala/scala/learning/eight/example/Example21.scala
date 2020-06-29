package scala.learning.eight.example
// 08-4. 패키징된 클래스에 접근하기: 임포트 그룹 사용하기 예제
import scala.collection.mutable.{Queue, ArrayBuffer}

object Example21 extends App {
  val q = Queue[Int]()
  val b = ArrayBuffer[String]()
  val m = Map(1 -> 2)
  println(q.getClass, b.getClass, m.getClass)
}
