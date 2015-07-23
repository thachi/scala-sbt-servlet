
name := "scala-sbt-servlet"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

enablePlugins(JettyPlugin)

containerPort := 9090