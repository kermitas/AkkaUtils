object Build extends sbt.Build {

  lazy val version = "0.2.0-SNAPSHOT"

  // --- projects definition

  lazy val akkaUtils = AkkaUtilsProject(version)
}
