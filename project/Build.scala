import sbt.Keys._
import sbt._

object Build extends Build {
  val project = "failurewall"
  def idOf(name: String): String = s"$project-$name"

  val basicSettings = Seq(
    organization := "com.okumin",
    version := "0.1.0",
    scalaVersion := "2.11.7"
  )

  lazy val akka23 = Project(
    id = idOf("akka23"),
    base = file(idOf("akka23")),
    settings = basicSettings ++ Publish.projectSettings ++ Seq(
      name := idOf("akka23"),
      libraryDependencies ++= Seq(
        "com.okumin" %% "failurewall-core" % "0.1.0",
        "com.typesafe.akka" %% "akka-actor" % "2.3.14",
        "org.mockito" % "mockito-core" % "1.10.19" % "test",
        "org.scalatest" %% "scalatest" % "2.2.4" % "test",
        "org.scalacheck" %% "scalacheck" % "1.12.5" % "test"
      )
    )
  )
}
