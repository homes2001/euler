package com.homes2001.euler
object Euler010 extends Application { //TODO rework
  var z = new Array[Boolean](2000000);
  for (i <- 2 to 2000000) {
    var m = 2;
    if ((i%1000) == 0)
      print (".")
    while ((m * i) < 2000000) {
      z(m * i) = true;
      m=m+1;
    }
  }
  var sum=0l;
  for (i <- 2 to 1999999)
    if (!z(i))
      sum+=i;
  println (sum);
}