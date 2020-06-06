package scala.learning.two.example
// 02-4. 타입: 문자열 예제
object Example07 extends App {
  val hello = "Hello There"
  val signature = "With Regards, \nYour friend"
  val greeting_0 = "Hello, " + "World"
  val matched = (greeting_0 == "Hello, World")
  val theme = "Na " * 16 + "Batman!"
  val greeting_1 =
    """She suggested reformatting the file
      | by replacing tabs (\t) with newlines (\n);
      | "why do that?", he asked.  """

  println(hello)
  println(signature)
  println(greeting_0)
  println(matched)
  println(theme)
  println(greeting_1)
}
