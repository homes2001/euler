package com.homes2001.euler
import scala.math.BigDecimal
object Euler016 extends Application {
	println (BigInt(2).pow(1000).toString().foldLeft(0l)((s,x) => s+(x+"").toInt))
}