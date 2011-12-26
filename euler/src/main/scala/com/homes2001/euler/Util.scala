package com.homes2001.euler
object Util {
  def data(id: String): String = {
    io.Source.fromInputStream(getClass.getResourceAsStream(id)).mkString
  }
}