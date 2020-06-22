package scala.learning.seven.example
// 07-3. Seq와 시퀀스 예제
// Iterable의 서브타입이면서 java.lang.String의 래퍼로서, 두 타입의 메소드를 모두 이용하는 예제
// ++, take는 Iterable왔으며 String은 Char의 시퀀스
// replaceAll은 스칼라 연산자로 호출된 java.lang.String의 연산
object Example07 extends App {
  val hi = "Hello, " ++ "worldly" take 12 replaceAll("w", "W")
  println(hi, hi.getClass)

  for (char <- hi) println(char, char.getClass)
}
