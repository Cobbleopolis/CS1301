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

lazy val `helloWorld` = createProject("helloWorld")

def createProject(name: String): Project = {
    val projectObject = Project(id = name, base = file(name)).settings(commonSettings: _*).settings(
        organization := s"$baseOrganization.$name"
    ).dependsOn(common)
    root.aggregate(projectObject)
    projectObject
}