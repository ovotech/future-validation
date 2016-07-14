import sbt._

object Dependencies {
  def all = Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.0",
    "org.specs2" %% "specs2-core" % "3.7.2" % "test",
    "org.specs2" %% "specs2-mock" % "3.7.2" % "test",
    "org.mockito" % "mockito-all" % "1.10.8" % "test",
    "org.hamcrest" % "hamcrest-all" % "1.3" % "test"
  )
}