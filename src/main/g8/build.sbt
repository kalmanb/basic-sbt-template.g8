organization := "$package$"

name := "$name;format="norm"$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.4",
  "org.scalatest" %% "scalatest" % "2.0.RC1-SNAP6" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test" 
)




