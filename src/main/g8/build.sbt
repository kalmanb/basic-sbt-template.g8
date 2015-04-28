organization := "$package$"

name := "$name;format="norm"$"

scalaVersion := "2.11.6"

val AkkaVersion = "2.3.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "org.scalaz" %% "scalaz-core" % "7.2.0-M1",
  "com.chuusai" %% "shapeless" % "2.2.0-RC4"
)
// Other libs that maybe useful
//val SprayVersion = "1.3.1"
//val SlickVersion = "2.1.0"
  //"com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  //"com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  //"com.typesafe.akka" %% "akka-testkit" % AkkaVersion % "test",
  //"org.scalaz" %% "scalaz-core" % "7.1.0",
  //"com.chuusai" %% "shapeless" % "2.0.0",
  //"io.spray" %% "spray-can" % SprayVersion,
  //"io.spray" %% "spray-routing" % SprayVersion,
  //"io.spray" %% "spray-client" % SprayVersion,
  //"io.spray" %%  "spray-json" % "1.2.6",
  //"com.google.guava" % "guava" % "17.0",
  //"joda-time" % "joda-time" % "2.4",
  //"org.joda" % "joda-convert" % "1.2",
  //"com.typesafe.slick" %% "slick" % SlickVersion,
  //"com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0",
  //"mysql" % "mysql-connector-java" % "5.1.32",
  //"ch.qos.logback" % "logback-classic" % "1.0.9",
  //"org.slf4j" % "slf4j-api" % "1.7.2",
  //"org.scalatest" %% "scalatest" % "2.2.2",
  //"junit" % "junit" % "4.11" % "test",
  //"org.mockito" % "mockito-all" % "1.9.5" % "test" 

lazy val root = project.in(file(".")).dependsOn(testSpecs % "test->test")

lazy val testSpecs = RootProject(uri("git://github.com/kalmanb/scalatest-specs.git#0.1.1"))







