package com.clrs

import scala.annotation.tailrec

/**
  * Created by ignacio on 26/10/16.
  */
object CrackingTheCodingInterview {

  @tailrec
  def rotate(i: Int, a: Array[Int]): Array[Int] = i match {
    case 0 => a
    case _ => rotate(i - 1, a.tail :+ a.head)
  }
}
