package com.homes2001.euler
import scala.util.matching.Regex
object Euler017 extends Application {
  val d2 = "([0-9])([0-9])".r
  val d3 = "([0-9])([0-9])([0-9])".r
  def word(v: String): String = v match {
    case "1" => "one"
    case "2" => "two"
    case "3" => "three"
    case "4" => "four"
    case "5" => "five"
    case "6" => "six"
    case "7" => "seven"
    case "8" => "eight"
    case "9" => "nine"
    case "10" => "ten"
    case "11" => "eleven"
    case "12" => "twelve"
    case "13" => "thirteen"
    case "14" => "fourteen"
    case "15" => "fifteen"
    case "16" => "sixteen"
    case "17" => "seventeen"
    case "18" => "eighteen"
    case "19" => "nineteen"
    case "20" => "twenty"
    case "30" => "thirty"
    case "40" => "forty"
    case "50" => "fifty"
    case "60" => "sixty"
    case "70" => "seventy"
    case "80" => "eighty"
    case "90" => "ninety"
    case d2("0", x) => word(x)
    case d2(x, y) => word(x + "0") + "-" + word(y)
    case d3(x, "0", "0") => word(x) + " hundred"
    case d3(x, y, z) => word(x) + " hundred and " + word(y + z)
    case "1000" => "one thousand"
  }
  println((1 to 1000).map(x => word(x.toString)).foldLeft("")((s, x) => s + x).filter(_.isLetter).size)
}