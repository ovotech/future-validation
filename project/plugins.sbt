resolvers ++= Seq(
  Resolver.typesafeRepo("releases"),
  "BFil Nexus Releases" at "http://nexus.b-fil.com/nexus/content/repositories/releases/"
)

addSbtPlugin("com.bfil" % "sbt-bfil" % "0.2.1")
