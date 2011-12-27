package com.homes2001.euler
import scala.math.BigInt
object Euler020 extends Application {
  def factorial(n: BigInt): BigInt = if (n == 0) 1 else n * factorial(n - 1)
  println(factorial(100).toString().foldLeft(0l)((s, x) => s + (x + "").toInt))
}