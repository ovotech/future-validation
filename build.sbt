import com.ovoenergy.sbt._

name := "future-validation"
libraryDependencies ++= Dependencies.all

new OvoBuild {}.basicSettings
Publish.defaultSettings