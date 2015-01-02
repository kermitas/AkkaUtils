import sbt._
import Keys._

object AkkaUtilsProject {

  lazy val projectName = "akkautils"

  def apply(version: String) =
    Project(
      id           = projectName,
      base         = file("."),

      settings     = CommonSettings(projectName, version) ++
                     AkkaSettings()
    )
}
