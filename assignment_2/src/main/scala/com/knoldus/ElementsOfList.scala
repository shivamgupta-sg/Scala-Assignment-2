package com.knoldus

import scala.annotation.tailrec

class ElementsOfList {
  @tailrec final def lastElement(integerList: List[Int]): Int = {
    integerList match {
      case x :: Nil => x
      case x :: restOfList => lastElement(restOfList)
    }
  }

  def printTableOfElement(element: Int) = {
    for (counter <- 1 to 10) {
      println(s"$element * $counter = ${
        element * counter
      }")
    }
  }
}
