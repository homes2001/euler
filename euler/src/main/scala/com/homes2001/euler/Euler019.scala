package com.homes2001.euler
import java.util.GregorianCalendar
import java.util.Calendar
import java.text.SimpleDateFormat
object Euler019 extends Application {
  def sunday(date: String): Boolean = {
    val cal = new GregorianCalendar()
    cal.setTime(new SimpleDateFormat("yyyy-M-d").parse(date))
    return cal.get(Calendar.DAY_OF_WEEK) == 1
  }
  println((1901 to 2000).foldLeft(List[String]())((s, x) => s ++ (1 to 12).map(x + "-" + _ + "-1")).filter(sunday(_)).size)
}