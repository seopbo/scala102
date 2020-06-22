package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Try 컬렉션 예제
object Example16 extends App {
  def loopAndFail(end: Int, failAt: Int): Int = {
    for (i <- 1 to end) {
      println(s"$i) ")
      if (i == failAt) throw new Exception("Too many iterations")
    }
    end
  }
  /*
    util.Try는 함수 매개변수를 취하며 우리가 loopAndFail을 호출할 때, 자동으로 함수 리터럴로 전환됨.
     - 함수 리터럴이 안전하게 종료되면 반환값을 포함한 Success를 가지게됨.
     - 함수 리터럴에서 예외가 발생하면 예외를 포함한 Failure를 가지게됨.
   */
  val t1 = util.Try(loopAndFail(2, 3))
  println(t1)
  val t2 = util.Try(loopAndFail(4, 2))
  println(t2)
}
