package scala.learning.four.exercise
import scala.io.StdIn.readLong

object Exercise04 {
  def main(args: Array[String]): Unit = {
    println(descTime(readLong))
  }
  def descTime(epochMs: Long): String = {
    val secs = epochMs / 1000
    val days = secs / 86400
    val hours = (secs % 86400) / 3600
    val minutes = (secs % 3600) / 60
    val seconds = secs % 60
    s"$days days, $hours hours, $minutes minutes, $seconds seconds"
  }
}
