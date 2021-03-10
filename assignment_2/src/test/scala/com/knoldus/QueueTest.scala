package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val emptyQueue = new Queue[Int]

  "peek" should "return the top of the stack for non-empty stack" in {
    val nonEmptyQueue = Queue[Int](1, 2, 3, 4)

    val topElement = nonEmptyQueue.peek
    assert(topElement == 4)
  }

  "peek" should "throw NoSuchElementException for empty stack" in {
    assertThrows[NoSuchElementException] {
      emptyQueue.peek
    }
  }

  "isEmpty" should "returns true for empty stack" in {
    val isEmpty = emptyQueue.isEmpty

    assert(isEmpty)
  }

  "isEmpty" should "returns false for non-empty stack" in {
    val nonEmptyQueue = Queue[Int](1, 2, 3, 4)

    val isEmpty = nonEmptyQueue.isEmpty

    assert(!isEmpty)
  }

  "push" should "add new element to top of the stack" in {
    val nonEmptyQueue = Queue[Int](1, 2, 3, 4)

    nonEmptyQueue.enqueue(10)

    assert((nonEmptyQueue.length == 5) && (!nonEmptyQueue.isEmpty) && (nonEmptyQueue.peek == 10))
  }

  "pop" should "delete the top of the stack and return the element for non-empty stack" in {
    val nonEmptyQueue = Stack[Int](1, 2, 3, 4)

    val poppedElement = nonEmptyQueue.pop

    assert(poppedElement == 4)
  }

  "pop" should "throw exception for non-empty stack" in {
    assertThrows[NoSuchElementException] {
      emptyQueue.dequeue
    }
  }
}
