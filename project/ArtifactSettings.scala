import sbt.Keys._

object ArtifactSettings {
  def apply(artifactName: String, projectVersion: String) = Seq(
    name         := artifactName,
    version      := projectVersion,
    organization := "as.akkautils"
  )
}


