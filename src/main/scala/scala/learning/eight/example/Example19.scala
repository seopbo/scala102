package scala.learning.eight.example
// 08-4. 패키징된 클래스에 접근하기: 패키징된 클래스 임포트하기 예제
object Example19 extends App {
  println("Your new UUID is " + {import java.util.UUID; UUID.randomUUID})
}
