organization := "lt.dvim.hof"
name := "hof"
description := "Tools for working with history files of fish shell"

scalaVersion := "2.13.1"

val Akka = "2.6.4"
val GraalAkka = "0.5.0"
val Monocle = "2.0.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka"          %% "akka-actor"        % Akka,
  "com.typesafe.akka"          %% "akka-stream"       % Akka exclude ("com.typesafe.akka", "akka-protobuf-v3_2.13"),
  "com.github.vmencik"         %% "graal-akka-actor"  % GraalAkka,
  "com.github.vmencik"         %% "graal-akka-stream" % GraalAkka,
  "com.github.julien-truffaut" %% "monocle-core"      % Monocle,
  "com.github.julien-truffaut" %% "monocle-macro"     % Monocle,
  "com.monovore"               %% "decline"           % "1.0.0",
  "org.typelevel"              %% "cats-effect"       % "2.1.2",
  "com.lihaoyi"                %% "fansi"             % "0.2.9",
  "org.scalameta"              %% "munit"             % "0.7.1" % Test
)

testFrameworks += new TestFramework("munit.Framework")

scalafmtOnCompile := true

ThisBuild / scalafixDependencies ++= Seq(
  "com.nequissimus" %% "sort-imports" % "0.3.1"
)

enablePlugins(AutomateHeaderPlugin)
startYear := Some(2020)
organizationName := "History of Fishing"
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))

enablePlugins(JavaAppPackaging)
enablePlugins(GraalVMNativeImagePlugin)
