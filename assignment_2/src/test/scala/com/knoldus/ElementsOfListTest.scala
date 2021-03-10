package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ElementsOfListTest extends AnyFlatSpec {

  "lastElement" should "give last Element of the list" in {
    val integerList = List(1, 2, 3, 4, 5, 6)
    val elementsOfListTest = new ElementsOfList
    val result = elementsOfListTest.lastElement(integerList)

    assert(result == 6)
  }

}
