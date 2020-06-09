package scala.learning.five.example
// 05-3. 함수 리터럴 작성하기 예제
object Example10 extends App {
  def logStart() = "=" * 50 + "\nStarting Now\n" + "=" * 50
  def start = () => "=" * 50 + "\nStarting Now\n" + "=" * 50
  println(logStart())
  println(start())
}
