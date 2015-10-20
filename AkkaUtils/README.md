#Akka Utils
Helper classes for [Akka](http://akka.io).

## Usage:
Use it as your dependency (SBT):

```scala
libraryDependencies += "as.akkautils" %% "akkautils" % "xx.yy.zz-SNAPSHOT" // instead of 'xx.yy.zz-SNAPSHOT' please use latest version from project/Build.scala 
```

## SBT:

#### Compile:
- clone into your local drive: `git clone https://github.com/kermitas/AkkaUtils.git`
- go to root folder (`cd AkkaUtils`)
- start SBT `sbt`
- execute `compile` command

#### Cross compilation:
- many commands (like `compile` or `publish-local`) prefixed with '+' will perform cross compilation

#### IntelliJ Idea project:
- if you are using [IntelliJ Idea](http://www.jetbrains.com/idea/) you can generate Idea project using `gen-idea` command

#### Publish artifact:
- publishing into your local repository `publish-local` (I recommend `+publish-local`)
- publishing into BioDiscovery's Artifactory `publish` (I recommend `+publish`)

#### Statistics:
- `stats` command will print statistics (like number of Scala files, Java files, number of lines etc.)

#### Dependency graph:
- project is using *sbt-dependency-graph* SBT plugin, execute `dependency-graph-ml` command to generate .graphml files in all *target* directories of all sub-projects (you can use [yEd](http://www.yworks.com/en/products_yfiles_about.html) to open them, then choose *Layout > Hierarchical*)

#### Code formatting:
- code format is guarded by [Scalariform](https://github.com/daniel-trinh/scalariform), formatting is done before each compilation
- formatting rules are consistent for all projects of this SBT multi-project and are defined in `project/ScalariformSettings.scala`
- no unformatted code is allowed in this project

## GIT (source repository)
This repository works in branching model described in "[A successful Git branching model](http://nvie.com/posts/a-successful-git-branching-model/)".
