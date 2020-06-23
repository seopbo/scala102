package scala.learning.eight.example
// 08-3. 그 외의 필드와 메소드 유형: lazy value
/*
  필드 x는 인스턴스가 생성될 때 초기화, 필드 y는 처음 호출될 때 초기화
 */
class RandomPoint {
  val x = {println("creating x"); util.Random.nextInt}
  lazy val y = {println("now y"); util.Random.nextInt}
}

object Example16 extends App {
  val p = new RandomPoint
  println(s"Location is ${p.x}, ${p.y}")
}
