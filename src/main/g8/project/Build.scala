import sbt._
import Keys._

object PatientNotes extends Build {
  val projectName = "project-name"

  override lazy val settings = super.settings ++ Seq(resolvers := Seq())

  // TODO - install the following:
  // https://github.com/softprops/less-sbt
  // https://github.com/softprops/coffeescripted-sbt
  // https://github.com/untyped/sbt-plugins/tree/master/sbt-js

  val akkaVersion = "2.1.0"
//  val sprayVersion = "1.1-20130110"

  val scalaReflect = "org.scala-lang" % "scala-reflect" % "2.10.0"
//  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
//  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
//  val akkaTestKit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion
//  val sprayCan = "io.spray" % "spray-can" % sprayVersion
//  val sprayRouting = "io.spray" % "spray-routing" % sprayVersion
//  val sprayCaching = "io.spray" % "spray-caching" % sprayVersion
//  val sprayTestKit = "io.spray" % "spray-testkit" % sprayVersion
//
//  val slick = "com.typesafe" %% "slick" % "1.0.0-RC1"

  val slf4j = "org.slf4j" % "slf4j-api" % "1.7.2"
  val scalaTest = "org.scalatest" %% "scalatest" % "2.0.M5b" % "test"
  val junit = "junit" % "junit" % "4.11" % "test"
  val mockito = "org.mockito" % "mockito-all" % "1.9.5" % "test"

  val publishedScalaSettings = Seq(
    scalaVersion := "2.10.0",
    //scalaBinaryVersion <<= scalaVersion,
    //libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _),
    //libraryDependencies in config("macro") <+= scalaVersion("org.scala-lang" % "scala-compiler" % _),
    resolvers ++= Seq(
      Resolver.sonatypeRepo("snapshots"),
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
 //     "spray repo" at "http://repo.spray.io",
 //     "spray repo nightlies" at "http://nightlies.spray.io"
     ),

    libraryDependencies ++= Seq(
      scalaReflect,
//      akkaActor,
//      akkaSlf4j,
//      akkaTestKit,
//      sprayCan,
//      sprayRouting,
//      sprayCaching,
//      slick,
//
//      // Testing Libs
//      sprayTestKit,
      slf4j,
      scalaTest,
      junit,
      mockito))

  lazy val root = Project(id = projectName,
    base = file("."),
    settings = Project.defaultSettings ++ publishedScalaSettings)

}

