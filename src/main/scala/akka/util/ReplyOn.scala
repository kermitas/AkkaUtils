package akka.util

import akka.actor.ActorRef

trait ReplyOn1[T] extends Serializable {
  def request1: MessageWithSender[T]
}

class ReplyOn1Impl[T](val request1: MessageWithSender[T]) extends ReplyOn1[T] {
  def this(message: T, messageSender: ActorRef) = this(new MessageWithSender(message, messageSender))
}

trait ReplyOn2[T, E] extends ReplyOn1[T] {
  def request2: MessageWithSender[E]
}

class ReplyOn2Impl[T, E](request1: MessageWithSender[T], val request2: MessageWithSender[E]) extends ReplyOn1Impl[T](request1) {
  def this(message1: T, messageSender1: ActorRef, message2: E, messageSender2: ActorRef) = this(new MessageWithSender(message1, messageSender1), new MessageWithSender(message2, messageSender2))
}