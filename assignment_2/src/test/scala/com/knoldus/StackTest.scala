package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {

  val emptyStack = new Stack[Int]

  "peek" should "return the top of the stack for non-empty stack" in {
    val nonEmptyStack = Stack[Int](1, 2, 3, 4)

    val topElement = nonEmptyStack.peek
    assert(topElement == 4)
  }

  "peek" should "throw NoSuchElementException for empty stack" in {
    assertThrows[NoSuchElementException] {
      emptyStack.peek
    }
  }

  "isEmpty" should "returns true for empty stack" in {
    val isEmpty = emptyStack.isEmpty

    assert(isEmpty)
  }

  "isEmpty" should "returns false for non-empty stack" in {
    val nonEmptyStack = Stack[Int](1, 2, 3, 4)

    val isEmpty = nonEmptyStack.isEmpty

    assert(!isEmpty)
  }

  "push" should "add new element to top of the stack" in {
    val nonEmptyStack = Stack[Int](1, 2, 3, 4)

    nonEmptyStack.push(10)

    assert((nonEmptyStack.length == 5) && (!nonEmptyStack.isEmpty) && (nonEmptyStack.peek == 10))
  }

  "pop" should "delete the top of the stack and return the element for non-empty stack" in {
    val nonEmptyStack = Stack[Int](1, 2, 3, 4)

    val poppedElement = nonEmptyStack.pop

    assert(poppedElement == 4)
  }

  "pop" should "throw exception for non-empty stack" in {
    assertThrows[NoSuchElementException] {
      emptyStack.pop
    }
  }
}
