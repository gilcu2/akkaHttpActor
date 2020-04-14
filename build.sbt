name := "akkaHttpActor"

version := "0.1"

scalaVersion := "2.13.1"

lazy val akkaVersion = "2.6.4"
lazy val akkaHttpVersion = "10.1.11"

libraryDependencies ++= Seq(

  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,

  "org.rogach" %% "scallop" % "3.3.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,

  "ch.qos.logback"    % "logback-classic"           % "1.2.3",

  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % "test"

)