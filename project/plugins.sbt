resolvers ++= Seq(
  "OVO Release" at "http://nexus.ovotech.org.uk:8081/nexus/content/repositories/releases/",
  "OVO Snapshots" at "http://nexus.ovotech.org.uk:8081/nexus/content/repositories/snapshots/"
)

addSbtPlugin("com.ovoenergy" %% "sbt-ovo" % "0.4.6")
