package scala.learning.nine.example
// 09-1. 객체: 객체 정의하기 구문 예제
object Example01 extends App {
  println(Hello.hi)
  println(Hello.hi)
}

object Hello {
  /*
    Hello 객체에 최초 접근하는 시점인 인스턴스화/초기화 시점에 호출되며, Hello 객체의 "hi" 메소드를 반복적으로 호출해도
    동일한 전역 인스턴스를 재사용하기 때문에 추가적인 초기화는 일어나지 않음.
  */
  println("in Hello")
  def hi = "hi"
}