name := "tip"

scalaVersion := "2.12.12"

trapExit := false

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.parboiled" %% "parboiled" % "2.1.8"

scalaSource in Compile := baseDirectory.value / "src"

Compile / unmanagedJars += {
  baseDirectory.value / "lib" / "scala-smtlib.jar"
}

