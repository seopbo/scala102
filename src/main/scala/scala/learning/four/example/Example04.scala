package scala.learning.four.example
// 04-0. 개요: 함수 정의하기 예제: return을 활용한 조기종료
object Example04 {
  def main(args: Array[String]): Unit = {
    def safeTrim(s: String): String = {
      if (s == null) return null
      s.trim()
    }
    println(safeTrim(null))
  }
}
