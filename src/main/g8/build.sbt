organization := "$package$"

name := "$name;format="norm"$"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "org.scalaz" %% "scalaz-core" % "7.1.0-M7",
  "com.chuusai" %% "shapeless" % "2.0.0",
  "org.scalatest" %% "scalatest" % "2.1.7" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test" 
)





