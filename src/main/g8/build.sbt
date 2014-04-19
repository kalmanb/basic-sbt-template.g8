organization := "$package$"

name := "$name;format="norm"$"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "org.scalaz" %% "scalaz-core" % "7.0.6",
  "org.scalatest" %% "scalatest" % "2.1.3" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test" 
)





