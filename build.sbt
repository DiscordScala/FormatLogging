lazy val root = (project in file("."))
  .settings(
    name         := "formatlogging",
    organization := "github.discordscala",
    scalaVersion := "2.12.4",
    version      := "0.1.0",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    )
  )
