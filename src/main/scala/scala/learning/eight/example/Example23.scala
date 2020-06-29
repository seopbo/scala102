package scala.learning.eight.example
// 08-4. 프라이버시 제어: protected
class User23 {protected val passwd = scala.util.Random.nextString(10)}

class ValidUser extends User23 {def isValid = ! passwd.isEmpty}

object Example23 extends App {
  val user = new ValidUser()
  val isValid = user.isValid
//  val passwd = user.passwd
}
