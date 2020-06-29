package scala.learning.eight.example
// 08-4. 패키징된 클래스에 접근하기: 패키징된 클래스 임포트하기 예제
import scala.collection.mutable._

object Example20 extends App {
  val b = ArrayBuffer[String]()
  b += "Hello"
  println(b)
  val q = Queue[Int]()
  q.enqueue(3, 4, 5)
  val pop = q.dequeue
  println(q)
}
