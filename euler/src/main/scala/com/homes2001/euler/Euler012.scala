package com.homes2001.euler
object Euler012 extends Application { //TODO rework
  def factors(x: Long, fct: Long = 1, cnt: Long = 0, req : Long): Long = 
    if (fct < 1) return cnt
    else if ((cnt+fct) < req) return -1
    else if (x % fct == 0) return factors(x,fct-1,cnt+1, req)
    else return factors(x,fct-1,cnt, req)
  def triangle(x : Int) : Long = (1 to x).foldLeft(0l)((sum,x) => sum+x)
  var sum=0;
  for (x <- (1 to 250000)) {
    sum+= x;
    val num = factors(sum,sum,0, 500);
    if (num > 500) {
      println (x + "/" + sum + "/" + num);
    }
  } 
}