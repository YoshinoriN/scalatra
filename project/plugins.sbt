scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

addSbtPlugin("org.xerial.sbt"       % "sbt-sonatype"         % "2.5")
addSbtPlugin("org.scalariform"      % "sbt-scalariform"      % "1.8.3")
addSbtPlugin("com.timushev.sbt"     % "sbt-updates"          % "0.4.2")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"              % "1.1.2")
addSbtPlugin("com.eed3si9n"         % "sbt-unidoc"           % "0.4.2")
