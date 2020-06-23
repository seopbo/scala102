package scala.learning.eight.example
// 08-0. 개요: 다형성
/*
  A가 부모 클래스, B는 A를 확장 (상속), C는 B를 확장 (상속)
  - 서브 클래스의 인스턴스를 부모 클래스의 타입을 갖는 값에 저장하는 것이 가능함. (반대는 불가)
 */
object Example06 extends App {
  val misc = List[A](new C, new A, new B)
  misc.foreach(x => println(x.hi))
}
