enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "app"

scalaVersion := "2.13.2"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.5"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.5"
libraryDependencies += "org.typelevel" %% "cats-effect" % "3.2.9"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.6.1"


npmDependencies in Compile ++= Seq(
  "aws-amplify" -> "4.3.8",
  "aws-amplify-react-native" -> "6.0.1"
) 

scalacOptions += "-Ymacro-annotations"

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))
