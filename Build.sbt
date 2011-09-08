name := "TechAn"

version := "1.0"

organization := "org.techan"

// set the Scala version used for the project
scalaVersion := "2.9.1"

// add a test dependency on ScalaTest
libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

//changes the cmd prompt to show the project id
//shellPrompt in ThisBuild := {s => Project.extract(s).currentProject.id + ">	" }	
shellPrompt in ThisBuild := {s => "techan>	" }