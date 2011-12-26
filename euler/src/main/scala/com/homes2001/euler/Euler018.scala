package com.homes2001.euler
object Euler018 extends Application {
  object Algorithm {
    def max(data: Array[Array[Int]]): Int = {
      val r = Array(Array.fill(data.last.size + 1)(0)) ++ data.reverse;
      r.drop(1).foldLeft(r.first)((s, x) => x.zipWithIndex map (e => Math.max(e._1 + s(e._2), e._1 + s(e._2 + 1))))(0)
    }
  }
  println(Algorithm.max(Util.data("data018.txt").lines.map(x => x.split(" ").map(_.toInt)).toArray))
}