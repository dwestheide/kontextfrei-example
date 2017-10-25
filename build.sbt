name := "kontextfrei-example"

val common = Seq(
  organization := "com.danielwestheide",
  version := "0.0.1-SNAPSHOT",
  resolvers += "dwestheide" at "https://dl.bintray.com/dwestheide/maven",
  scalacOptions ++= Seq("-feature",
                        "-language:higherKinds",
                        "-language:implicitConversions")
)

val spark                = "org.apache.spark"    %% "spark-core"                        % "2.1.0"
val scalatest            = "org.scalatest"       %% "scalatest"                         % "3.0.4" % "test,it"
val scalacheck           = "org.scalacheck"      %% "scalacheck"                        % "1.13.4" % "test,it"
val jodaTime             = "joda-time"           % "joda-time"                          % "2.9.3"
val jodaConvert          = "org.joda"            % "joda-convert"                       % "1.8.1"
val kontextfreiCore      = "com.danielwestheide" %% "kontextfrei-core-spark-2.1.0"      % "0.6.0"
val kontextfreiScalaTest = "com.danielwestheide" %% "kontextfrei-scalatest-spark-2.1.0" % "0.6.0"

scalaVersion := "2.11.8"

lazy val ItTest = config("it") extend Test

lazy val example = Project(id = "kontextfrei-example", base = file("."))
  .settings(common)
  .settings(
    libraryDependencies ++= Seq(kontextfreiCore,
                                kontextfreiScalaTest,
                                spark,
                                scalatest,
                                scalacheck,
                                jodaTime,
                                jodaConvert))
  .configs(ItTest)
  .settings(inConfig(ItTest)(Defaults.testSettings))
  .settings(parallelExecution in ItTest := false)
