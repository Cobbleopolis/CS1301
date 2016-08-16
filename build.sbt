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

val subProjects: Seq[ProjectReference] = Seq()

lazy val `root` = (project in file(".")).settings(commonSettings: _*).settings(
    name := "CS1301"
).aggregate(subProjects: _*)

lazy val `common` = configureProject(project in file("common"))

lazy val `helloWorld` = configureProject(project in file("helloWorld"))

def configureProject(project: Project, projSettings: Seq[Def.Setting[_]] = Seq()): Project = {
    project.settings(commonSettings: _*).settings(
        organization := baseOrganization + "." + project.id,
        scalaVersion := "2.11.8"
    ).settings(projSettings: _*)
    if(project.id != "common")
        project.dependsOn(common)
    root.aggregate(project: ProjectReference)
    project
}