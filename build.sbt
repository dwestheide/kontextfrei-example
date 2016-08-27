name := "kontextfrei-example"

val common = Seq(
  organization := "com.danielwestheide",
  version := "0.0.1-SNAPSHOT",
  scalacOptions ++= Seq("-feature", "-language:higherKinds", "-language:implicitConversions")
)

val spark = "org.apache.spark" %% "spark-core" % "1.4.1"
val scalatest = "org.scalatest" %% "scalatest" % "2.2.6" % "test,it"
val scalacheck = "org.scalacheck" %% "scalacheck" % "1.12.5" % "test,it"
val jodaTime = "joda-time" % "joda-time" % "2.9.3"
val jodaConvert = "org.joda" % "joda-convert" % "1.8.1"
val kontextfreiCore = "com.danielwestheide" %% "kontextfrei-core" % "0.0.1-SNAPSHOT"

scalaVersion := "2.10.6"

lazy val ItTest = config("it") extend Test

lazy val example = Project(id = "kontextfrei-example", base = file("."))
  .settings(common)
  .settings(libraryDependencies ++= Seq(
    kontextfreiCore, spark, scalatest, scalacheck, jodaTime, jodaConvert))
  .configs(ItTest)
  .settings(inConfig(ItTest)(Defaults.testSettings))
  .settings(parallelExecution in ItTest := false)
