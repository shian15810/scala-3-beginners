val scala3Version = "3.3.4"

lazy val root = project.in(file(".")).settings(
  name         := "scala-3-beginners",
  version      := "0.1.0",
  scalaVersion := scala3Version,
  libraryDependencies +=
    "com.github.sbt" % "junit-interface" % "0.13.3" % "test")
