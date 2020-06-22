package scala.learning.seven.example
// 07-5. 모나딕 컬렉션: Option 컬렉션 예제
object Example14 extends App {
  val words = List("risible", "scavenger", "gist")
  val uppercase = words.find(w => w == w.toUpperCase)
  println(uppercase)
  val lowercase = words.find(w => w == w.toLowerCase)
  println(lowercase)

  /*
    연산은 현재 값 (Some)에 적용되고, 누락된 값 (None)에는 적용되지 않지만,
     결과 타입은 여전히 마지막 연산의 타입과 일치
   */

  val filtered = lowercase filter (_ endsWith "ible") map (_.toUpperCase)
  println(filtered, filtered.getClass)
  val exactSize = filtered filter (_.size > 15) map (_.size)
  println(exactSize, exactSize.getClass)
}
