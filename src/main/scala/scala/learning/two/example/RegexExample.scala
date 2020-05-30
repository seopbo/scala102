package scala.learning.two.example

object RegexExample extends App {

  // 기본
  val exampleSentence1 = "Froggy went a' courting"
  val exampleSentence2 = "milk, tea, muck"

  println(exampleSentence1.matches(".*courting"))
  println(exampleSentence2.replaceAll("m[^ ]+k", "coffee"))
  println(exampleSentence2.replaceFirst("m[^ ]+k", "coffee"))

  // 구문: 정규표현식으로 값 캡처하기
  // 고급: 캡처 그룹 (capture group) 활용
  val input = "Enjoying this apple 3.14159 times today"
  val pattern = """.* apple ([\d.]+) times .*""".r
  val pattern(amountText) = input
  val amount = amountText.toDouble

  println(amountText.getClass, amountText)
  println(amount.getClass, amount)
}
