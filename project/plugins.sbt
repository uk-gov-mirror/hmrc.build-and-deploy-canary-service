resolvers += Resolver.typesafeRepo("releases")

resolvers +=
  "HMRC-open-artifacts-maven" at "https://open.artefacts.tax.service.gov.uk/hmrc-public-releases-local/"

resolvers += Resolver.url("HMRC-open-artifacts-ivy",
    url("https://open.artefacts.tax.service.gov.uk/hmrc-public-sbt-plugin-releases-local/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc"       % "sbt-auto-build"     % "2.13.0")
addSbtPlugin("uk.gov.hmrc"       % "sbt-git-versioning" % "2.2.0")
addSbtPlugin("uk.gov.hmrc"       % "sbt-distributables" % "2.1.0")
addSbtPlugin("com.typesafe.play" % "sbt-plugin"         % "2.7.5")
addSbtPlugin("org.irundaia.sbt"  % "sbt-sassify"        % "1.4.11")
