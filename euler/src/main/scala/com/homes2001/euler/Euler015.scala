package com.homes2001.euler
object Euler015 extends Application {
  def fact(n: BigInt): BigInt = if (n == 0) 1 else n * fact(n - 1)
  def binom(n: BigInt, k: BigInt): BigInt = fact(n) / (fact(k) * fact(n - k))
  def routes(n: Int, k: Int = 0): BigInt = if (k > n - 1) 0 else binom(n - 1 + k, k) * 2 + routes(n, k + 1)
  println(routes(20))
}