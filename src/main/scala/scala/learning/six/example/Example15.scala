package scala.learning.six.example
// 06-4. 리스트 매핑 예
object Example15 extends App {
  println(List(0, 1, 0) collect {case 1 => "ok"})
  println(List("milk,tea").flatMap(_.split(","))) // map을 한 뒤, 그 결과에 flatten
  println(List("milk,tea").map(_.split(",")).flatten)
  println(List("milk", "tea").map(_.toUpperCase))
}