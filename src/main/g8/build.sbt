import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scala_version$",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := """$name$""",
    description := """$desc$""",
    libraryDependencies ++= Vector(
      scalaTest % Test
    )
  )
