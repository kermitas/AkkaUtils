package akka.util

import akka.actor.FSM

trait FSMSuccessOrStop[S, D] { self: FSM[S, D] =>

  /**
   * Use this method to surround initialization, for example:
   *
   * when(Initializing) {
   *   case Event(true, InitializingStateData) => successOrStop { ... }
   * }
   */
  protected def successOrStopWithFailure(f: => State): State = try {
    f
  } catch {
    case e: Exception => stop(FSM.Failure(e))
  }
}