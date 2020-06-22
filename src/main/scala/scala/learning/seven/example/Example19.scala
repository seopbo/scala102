package scala.learning.seven.example
import concurrent.ExecutionContext.Implicits.global // global context 활용
// 07-5. 모나딕 컬렉션: Future 컬렉션 예제
/*
  백그라운드 작업은 2 millis 동안 잠든 후에 "hi" 메시지를 출력하고, 그 사이에 main 스레드에서 코드는
  백그라운드 작업이 완료되기 전에 "waiting" 메시지를 출력함.
 */
object Example19 extends App {
  val f = concurrent.Future {Thread.sleep(2); println("hi")}
  println("waiting")
}
