package com.homes2001.euler
object Euler013 extends Application {
  println(Util.data("data013.txt").lines.map(BigInt(_)).sum)
}