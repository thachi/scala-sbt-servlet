
name := "scala-sbt-servlet"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

enablePlugins(JettyPlugin)

containerPort := 19090