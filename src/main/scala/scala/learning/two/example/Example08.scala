package scala.learning.two.example
// 02-4. 타입: 문자열 보간 예제
object Example08 extends App {
  // without string interpolation
  val approx = 355/113f
  println("Pi, using 355/133, is about " + approx + ".")

  // with string interpolation, prefix s
  println(s"Pi, using 355/133, is about $approx.")

  val item = "apple"
  println(s"How do you like them ${item}s?")
  println(s"Fish n chips n vinegar, ${"pepper " * 3}salt")

  // with string interpolation, prefix f
  println(f"I wrote a new $item%.3s today")
  println(f"Enjoying this $item ${355/113.0}%.5f times today")
}
