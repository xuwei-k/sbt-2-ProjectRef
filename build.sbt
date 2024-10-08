val root = project
  .in(file("."))
  .dependsOn(ProjectRef(file("a1"), "a1"))
