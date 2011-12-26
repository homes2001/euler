package com.homes2001.euler
object Euler014 extends Application { //TODO rework
  def collatzNext(n: Long): Long = if (n % 2 == 0) n / 2 else 3 * n + 1
  def collatz(n:Long) : List[Long] = if (n > 1) n :: collatz(collatzNext(n)) else List(1)
  val largest = (1 to 999999).foldLeft(1)((max,x) => if (collatz(max).size < collatz(x).size) x else max)
  println (largest + ", length: " + collatz(largest).size) 
}