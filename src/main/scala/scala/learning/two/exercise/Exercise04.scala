package scala.learning.two.exercise

object Exercise04 extends App {
  // 4. 다음을 더 간단하게 작성할 수 있는 방법이 있는 가?
  /*
    val flag: Boolean = false
    val result: Boolean = (flag == false)
   */
  val flag = false
  val result = !flag
}
