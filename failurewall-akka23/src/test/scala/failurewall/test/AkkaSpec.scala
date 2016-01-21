package failurewall.test

import akka.actor.ActorSystem
import org.scalatest.BeforeAndAfterAll

trait AkkaSpec
  extends WallSpec
  with BeforeAndAfterAll {

  val system = ActorSystem("akka-spec")

  override protected def afterAll(): Unit = {
    //system.shutdown()
    //system.awaitTermination(10.seconds)
  }
}
