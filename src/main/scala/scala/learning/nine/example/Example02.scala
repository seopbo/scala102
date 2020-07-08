package scala.learning.nine.example
// 09-1. 객체: 순수 함수를 유틸리티로 제공하는 객체
object Example02 extends App {
  val html = "<html><body><h1>Introduction</h1></body></html>"
  val text = HtmlUtils.removeMarkup(html)
  println(text)
}

object HtmlUtils {
  def removeMarkup(input: String) = {
    input
      .replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")
  }
}
