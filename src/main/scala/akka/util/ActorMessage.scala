package akka.util

import akka.actor.ActorRef

trait ActorMessage extends Serializable

trait IncomingMessage extends ActorMessage

class IncomingReplyableMessage(var replyAlsoOn: Option[Seq[ActorRef]] = None) extends ActorMessage

trait InternalMessage extends IncomingMessage

trait OutgoingMessage extends ActorMessage

class OutgoingReplyOn1Message[T <: IncomingReplyableMessage](request1: MessageWithSender[T]) extends ReplyOn1Impl(request1) with OutgoingMessage {

  def this(message: T, messageSender: ActorRef) = this(new MessageWithSender(message, messageSender))

  def reply(sender: ActorRef): Unit = {
    request1.messageSender.tell(this, sender)
    request1.message.replyAlsoOn.map(_.foreach(_.tell(this, sender)))
  }
}
class OutgoingReplyOn2Message[T <: IncomingReplyableMessage, E](request1: MessageWithSender[T], request2: MessageWithSender[E]) extends ReplyOn2Impl(request1, request2) with OutgoingMessage {

  def this(message1: T, messageSender1: ActorRef, message2: E, messageSender2: ActorRef) = this(new MessageWithSender(message1, messageSender1), new MessageWithSender(message2, messageSender2))

  def reply(sender: ActorRef): Unit = {
    request1.messageSender.tell(this, sender)
    request1.message.replyAlsoOn.map(_.foreach(_.tell(this, sender)))
  }
}