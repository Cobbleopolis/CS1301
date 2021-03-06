scalaVersion in ThisBuild := "2.11.8"

val baseOrganization: String = "com.cobble.cs"

val commonDeps = Seq(
    "junit" % "junit" % "4.10"
)

lazy val commonSettings = Seq(
    libraryDependencies ++= commonDeps,
    scalaVersion := "2.11.8",
    version := "1.0",
    crossPaths := false
)

lazy val `root` = (project in file(".")).settings(commonSettings: _*).settings(
    name := "CS1301"
).aggregate(common)

lazy val `common` = (project in file("common")).settings(commonSettings: _*)

lazy val `helloWorld` = createProject("helloWorld", "HelloWorld")

lazy val `lab` = createProject("lab")

lazy val `ao1` = createProject("ao1")

lazy val `hw` = createProject("hw")

lazy val `gp` = createProject("gp")

lazy val `inClass` = createProject("inClass")

def createProject(name: String, mainClassName: String = "Main", enableScala: Boolean = false): Project = {
    val org: String = s"$baseOrganization.$name"
    val projectObject = Project(id = name, base = file(name)).settings(commonSettings: _*).settings(
        organization := org,
        mainClass in (Compile, run) := Some(s"$org.$mainClassName"),
        mainClass in (Compile, packageBin) := Some(s"$org.$mainClassName"),
        autoScalaLibrary := enableScala
    ).dependsOn(common)
    root.aggregate(projectObject)
    projectObject
}