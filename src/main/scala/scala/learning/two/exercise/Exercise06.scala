package scala.learning.two.exercise

object Exercise06 extends App {
  /*6. 입력 문자열 "Frank,123 Main,925-555-1943,95122"와 정규 표현식 매칭 기법을 사용하여 전화번호를 추출해보자.
  전화번호의 각 부분을 정수 숫자로 전환할 수 있는가? 이 숫자를 어떻게 하나의 튜플에 저장할 수 있을까?
   */

  val patternOfPhoneNumber = """.+,.+,(\d{3})-(\d{3})-(\d{4}),.+""".r
  val patternOfPhoneNumber(head, mid, tail) = "Frank,123 Main,925-555-1943,95122"
  val phoneNumber = (head.toInt, mid.toInt, tail.toInt)
  println(phoneNumber)
}
