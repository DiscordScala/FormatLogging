lazy val root = (project in file("."))
  .settings(
    name         := "formatlogging",
    description  := "A library to allow easy logging using string formatters.",
    homepage     := Some(url("https://github.com/discordscala/formatlogging")),
    organization := "github.discordscala",
    organizationName := "DiscordScala",
    organizationHomepage := Some(url("https://github.com/discordscala")),
    licenses     += "MIT" -> url("http://www.opensource.org/licenses/mit-license.php"),
    scalaVersion := "2.12.4",
    version      := "0.1.0",
    useGpg       := true,
    publishMavenStyle := true,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    ),
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/discordscala/formatlogging"),
        "scm:git@github.com:discordscala/formatlogging.git"
      )
    ),
    developers := List(
      Developer(
        id    = "gerd",
        name  = "Gerd Sattler",
        email = "gerd@disroot.org",
        url   = url("https://gerd.tech")
      )
    )
  )
