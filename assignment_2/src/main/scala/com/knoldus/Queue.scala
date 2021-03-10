package com.knoldus

import scala.collection.mutable

class Queue[A] {
  private var queueList:List[A]=List()

  /**
   *
   * Add element to the end of the queue
   *
   * @param value element to add at the end of the queue
   *
   */
  def enqueue(value: A): Unit = {
    queueList = queueList :+ value
  };

  /**
   *
   * Delete first element from the
   *
   * @return Dequeued Element
   *
   */
  def dequeue = {
    val dequeueValue = queueList.head
    queueList = queueList.drop(1)

    dequeueValue
  }

  /**
   * Check if queue is empty
   * */
  def isEmpty = queueList.isEmpty

  /**
   * Gives end element of queue
   **/
  def peek = queueList.last

  def length = queueList.length

  override def toString = queueList.toString()
}

object Queue {
  def apply[A](elements: A*) = {
    val queueObject = new Queue[A]

    for (elem <- elements) {
      queueObject.enqueue(elem)
    }
    queueObject
  }
}