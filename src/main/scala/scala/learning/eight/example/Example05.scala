package scala.learning.eight.example
// 08-0. 개요: 상속
class A {
  def hi = "Hello from A"
  override def toString: String = getClass.getName
}

class B extends A
class C extends B {
  override def hi = "hi C -> " + super.hi
}

object Example05 extends App {
  val instanceA = new A()
  val instanceB = new B()
  val instanceC = new C()

  println(instanceA, instanceA.hi)
  println(instanceB, instanceB.hi)
  println(instanceC, instanceC.hi)
}
