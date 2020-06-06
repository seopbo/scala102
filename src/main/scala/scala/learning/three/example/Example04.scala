package scala.learning.three.example
// 03-3. 매치 표현식: 매치표현식 사용하기 예제
object Example04 extends App {
  val x = 10; val y = 20
  val max = x > y match {
    case true => x
    case false => y
  }
  println(max)
}
