package scala.learning.six.example
// 06-5. 리스트 축소하기
object Example16 extends App {
  val validations = List(true, true, false, true, true, true)
  val valid1 = !(validations.contains(false))
  val valid2 = validations.forall(_== true)
  val valid3 = validations.exists(_ == false)

  println(valid1)
  println(valid2)
  println(valid3)
}
