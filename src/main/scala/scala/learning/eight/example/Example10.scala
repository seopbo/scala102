package scala.learning.eight.example
// 08-1. 클래스 정의하기: 클래스를 타입 매개변수로 정의하기 예제
class Singular[A](element: A) extends Traversable[A] {
  def foreach[B](f: A => B) = f(element)
}

object Example10 extends App {
  val p = new Singular("Planes")
  p.foreach(println)
  val name = p.head
  println(name)
}

