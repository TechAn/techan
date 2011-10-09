name := "TechAn"

version := "1.0"

organization := "org.techan"

// set the Scala version used for the project
scalaVersion := "2.9.1"

// svn://activequant.org/opt/repositories/sandbox/activequant-base/trunk
// add a test dependency on ScalaTest
// libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"
// libraryDependencies += "org.activequant" % "activequant-framework" % "1.6"
libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.6.1" % "test",
	"org.activequant" % "activequant-framework" % "1.6" 
)

// resolvers += "activequant-repository" at "http://activequant.org/m2/repo"												 
// resolvers += "activequant-external-repository" at "http://activequant.org/m2/external"												 
resolvers ++= Seq(
	"activequant-repository" at "http://activequant.org/m2/repo",
	"activequant-external-repository" at "http://activequant.org/m2/external"
)

//changes the cmd prompt to show the project id
//shellPrompt in ThisBuild := {s => Project.extract(s).currentProject.id + ">	" }	
shellPrompt in ThisBuild := {s => "techan>	" }