package scala.learning.five.example
// 05-3. 함수 리터럴 작성하기 예제
object Example11 extends App {
  def safeString(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }
  val test: (String, String => String) => String = safeString
  println(test(null, (s: String) => s.reverse))
}
