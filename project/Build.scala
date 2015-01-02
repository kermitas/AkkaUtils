object Build extends sbt.Build {

  lazy val version = "0.1.0-SNAPSHOT"

  // --- projects definition

  lazy val akkaUtils = AkkaUtilsProject(version)
}
