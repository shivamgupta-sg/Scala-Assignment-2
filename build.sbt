name := "Scala Assignments"

version := "0.1"

scalaVersion := "2.13.5"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

lazy val assignmentTwo = project.in(file("assignment_2"))
  .settings(
    libraryDependencies += scalaTest
  )