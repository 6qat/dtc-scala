name := "DTC Scala"

version := "0.1"

scalaVersion := "2.11.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

libraryDependencies ++=
  "joda-time" % "joda-time" % "2.3" ::
  "org.joda" % "joda-convert" % "1.2" ::
  Nil



