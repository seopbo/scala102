package scala.learning.four.example
// 04-3. 표현식 블록을 이용한 함수 호출
object Example07 extends App {
  def formatEuro(amt: Double) = f"€$amt%.2f"
  println(formatEuro {val rate = 1.32; 0.235 + 0.7132 + rate * 5.32})
}
