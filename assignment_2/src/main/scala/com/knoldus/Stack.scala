package com.knoldus

class Stack[A] {
  private var stackList: List[A] = List()

  /**
   * Add element to top of the stack
   *
   * @param value element to add at the top of stack
   *
   */
  def push(value: A): Unit = {
    stackList = stackList :+ value // add value to top
  }

  /**
   * Pop the element on top of the stack
   *
   * @return popped element
   *
   * */
  def pop = {
    val popValue = stackList.last
    stackList = stackList.dropRight(1) // removes the top element

    popValue // Popped element
  }

  /**
   *
   * Checks if Stack is empty or not
   *
   * @return true or false
   *
   * */
  def isEmpty = stackList.isEmpty

  /**
   *
   * Check top of the stack
   *
   * @return top element
   *
   * */
  def peek = stackList.last

  def length = stackList.length

  override def toString = stackList.toString()
}

object Stack {
  def apply[A](elements: A*) = {
    val stackObject = new Stack[A]

    for (elem <- elements) {
      stackObject.push(elem)
    }
    stackObject
  }
}