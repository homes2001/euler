package com.homes2001.euler
object Euler067 extends Application { 
  println (Euler018.Algorithm.max(Util.data("data067.txt").lines.map(x => x.split(" ").map(_.toInt)).toArray))
}