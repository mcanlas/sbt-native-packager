addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.2")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.10")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.0.0")
addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

// Scripted plugin needs to declare this as a dependency
libraryDependencies += "jline" % "jline" % "2.11"

// For our bintray publishing
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

// For code formatting
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")

// binary compatibility checks
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")