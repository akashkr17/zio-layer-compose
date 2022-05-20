
val zioVersion = "1.0.12"
val scalaVer = "2.13.8"


lazy val settings = Seq(
  name := "zio-layer-compose",
  version := "1.0.0",
  scalaVersion := scalaVer,
  libraryDependencies ++=Seq(
    "dev.zio" %% "zio" % zioVersion,
    "dev.zio"          %% "zio-test"         % zioVersion % "test",
    "dev.zio"          %% "zio-test-sbt"     % zioVersion % "test",
  )
)
lazy val root = (project in file("."))
  .settings(settings)
