package com.knoldus

object MainClass extends App {
  val integerList = List(1, 2, 3, 4, 5, 100)

  val elementsOfList = new ElementsOfList

  // last element of the list
  val lastElement = elementsOfList.lastElement(integerList)

  println("Last Element of the List: " + lastElement)

  println()

  println("Table of each element of the list")

  // table of each element of the list
  for (element <- integerList) {
    println(s"Element: $element")
    elementsOfList.printTableOfElement(element)
    println()
  }

  // Stack
  val stack = new Stack[Int]

  stack.push(10)
  stack.push(20)
  stack.push(30)
  stack.push(5)

  stack.peek

  println(stack.pop)
  println(stack.pop)

  stack.peek

  // Queue
  val queue = new Queue[Int]

  queue.enqueue(10)
  queue.enqueue(20)
  queue.enqueue(30)
  queue.enqueue(40)

  queue.peek

  println(queue.dequeue)
  println(queue.dequeue)

  queue.peek
}
