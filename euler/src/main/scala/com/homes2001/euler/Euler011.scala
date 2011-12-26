package com.homes2001.euler
import scala.io.Source
import scala.collection.mutable.ListBuffer
object Euler011 extends Application { //TODO rework
  def diagonalize(data: List[List[Long]]) = {
    def shiftOneRow(rowsRemaining: List[List[Long]], lPad: List[Long], rPad: List[Long], rowsDone: List[List[Long]]): List[List[Long]] = {
      rowsRemaining match {
        case Nil => rowsDone
        case _ => {
          val newRow: List[Long] = lPad ::: rowsRemaining.head ::: rPad
          shiftOneRow(rowsRemaining.tail,
            lPad.tail,
            0 :: rPad,
            rowsDone ::: List(newRow))
        }
      }
    }
    shiftOneRow(data, List.fill(data.size)(0), List.empty, List.empty)
  }

  val grid = Util.data("data011.txt").lines.map(x => x.split(" ").map(y => y.toLong).toList).toList;
  val values = List(grid.map(_.sliding(4).map(_ product).max).max,
    grid.transpose.map(_.sliding(4).map(_ product).max).max,
    diagonalize(grid).transpose.map(_.sliding(4).map(_ product).max).max,
    diagonalize(grid.map(_.reverse)).transpose.map(_.sliding(4).map(_ product).max).max)

  println(values)
}