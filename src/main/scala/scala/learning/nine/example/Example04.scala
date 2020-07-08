package scala.learning.nine.example
// 09-1. 객체: apply 메소드와 동반객체 예제
// 클래스가 동반 객체의 private member에 접근
object Example04 extends App {
  val conn = DBConnection()
}

object DBConnection {
  private val db_url = "jdbc://localhost"
  private val db_user = "franken"
  private val db_pass = "berry"

  def apply() = new DBConnection
}

class DBConnection {
  private val props = Map(
    "url" -> DBConnection.db_url,
    "user" -> DBConnection.db_user,
    "pass" -> DBConnection.db_pass
  )
  println(s"Created new connection for " + props("url"))
}