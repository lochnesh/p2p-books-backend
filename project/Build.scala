import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "p2p-books"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.0.0",
      "org.mongodb" % "mongo-java-driver" % "2.10.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
