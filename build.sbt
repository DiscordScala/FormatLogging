lazy val root = (project in file("."))
  .settings(
    name         := "formatlogging",
    organization := "github.discordscala",
    organizationName := "DiscordScala",
    organizationHomepage := Some(url("https://github.com/discordscala")),
    description  := "A library to allow easy logging using string formatters.",
    url          := Some(url("https://github.com/discordscala/formatlogging")),
    licenses     += "MIT" -> url("http://www.opensource.org/licenses/mit-license.php"),
    scalaVersion := "2.12.4",
    version      := "0.1.0",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    ),
    publishTo := Some("Sonatype Snapshots Nexus" at "https://oss.sonatype.org/content/repositories/snapshots"),
    pomExtra := <developers>
      <developer>
        <name>Gerd Sattler</name>
        <email>gerd@disroot.org</email>
        <organization>DiscordScala</organization>
        <organizationUrl>https://github.com/discordscala</organizationUrl>
      </developer>
    </developers>
      <scm>
        <connection>scm:git:git://github.com/discordscala/formatlogging.git</connection>
        <developerConnection>scm:git:ssh://github.com:discordscala/formatlogging.git</developerConnection>
        <url>http://github.com/discordscala/formatlogging/tree/master</url>
      </scm>,
  )
