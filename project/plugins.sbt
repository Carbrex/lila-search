addSbtPlugin("ch.epfl.scala"                % "sbt-scalafix"         % "0.13.0")
resolvers += Resolver.sonatypeRepo("snapshots")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.13.0+95-69a3e105-SNAPSHOT"
addSbtPlugin("com.disneystreaming.smithy4s" % "smithy4s-sbt-codegen" % "0.18.27")
addSbtPlugin("com.github.sbt"               % "sbt-native-packager"  % "1.10.4")
addSbtPlugin("com.github.sbt"               % "sbt-release"          % "1.4.0")
addSbtPlugin("org.scalameta"                % "sbt-scalafmt"         % "2.5.2")
addSbtPlugin("org.typelevel"                % "sbt-tpolecat"         % "0.5.2")
