package scala.learning.seven.example
import concurrent.ExecutionContext.Implicits.global
import concurrent.Future
// 07-5. 모나딕 컬렉션: Future 컬렉션 예제
object Example20 extends App {
  /*
    nextFtr 메소드는 잠들어있다가 값을 반환하거나 예외를 발생시킴.
   */
  def nextFtr(i: Int = 0) = Future {
    def rand(x: Int) = util.Random.nextInt(x)

    Thread.sleep(0)
    if (rand(3) > 0) (i + 1) else throw new Exception
  }
  println(nextFtr(2))
}
