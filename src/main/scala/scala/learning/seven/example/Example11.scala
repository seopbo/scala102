package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Option 컬렉션 예제
// 널이 아닌 값과 널 값으로 Option을 생성하는 예제
object Example11 extends App {
  var x: String = "Indeed"
  println(x)
  var a = Option(x)
  println(a)
  x = null
  var b = Option(x)
  println(b)

  // isDefined와 isEmpty를 사용하여 주어진 Option이 각각 Some인지 None인지 확인
 println(s"a is defined? ${a.isDefined}")
  println(s"b is not defined? ${b.isEmpty}")
}
