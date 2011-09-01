//changes the cmd prompt to show the project id
shellPrompt in ThisBuild := {s => Project.extract(s).currentProject.id + ">	" }