package scala.learning.five.example
// 05-7. 부분 함수 예제
object Example19 extends App {
  def statusHandler1(x: Int): String = {
    x match {
      case 200 => "Okay"
      case 400 => "Your Error"
      case 500 => "Our error"
    }
  }
  println(statusHandler1(200))

  def statusHandler2: Int => String = {
    case 200 => "Okay"
    case 400 => "Your Error"
    case 500 => "Our error"
  }
  println(statusHandler2(400))

  def statusHandler3 = (x: Int) => {
    x match {
      case 200 => "Okay"
      case 400 => "Your Error"
      case 500 => "Our error"
    }
  }
  println(statusHandler3(500))
}

