/* This file is part of the scala-tptp-parser library. See README.md and LICENSE.txt in root directory for more information. */

lazy val tptpParser = (project in file("."))
  .settings(
    organization := "io.github.leoprover",
    name := "scala-tptp-parser",
    homepage := Some(url("https://github.com/leoprover/scala-tptp-parser")),
    description := """scala-tptp-parser is a library for parsing the input languages of the TPTP infrastructure
                     | for knowledge representation and reasoning.
                     |
                     | The package contains a data structure for the abstract syntax tree (AST) of the parsed input as well
                     | as the parser for the different language of the TPTP, see http://tptp.org for details. In particular,
                     | parser are available for:
                     |   - THF (TH0/TH1): Monomorphic and polymorphic higher-order logic,
                     |   - TFF (TF0/TF1): Monomorphic and polymorphic typed first-order logic, including extended TFF (TFX),
                     |   - FOF: Untyped first-order logic,
                     |   - TCF: Typed clause-normal form,
                     |   - CNF: (Untyped) clause-normal form, and
                     |   - TPI: TPTP Process Instruction language.
                     |
                     | The parser was initially based on v7.4.0.3 of the TPTP syntax BNF (http://tptp.org/TPTP/SyntaxBNF.html),
                     | but is continuously updated to keep track of TPTP language updates.""".stripMargin,
    scalaVersion := "2.13.13",
    // Version number explicitly removed as this is handled by the release plugin

    scmInfo := Some(ScmInfo(
      browseUrl = url("https://github.com/leoprover/scala-tptp-parser"),
      connection = "scm:git:git@github.com:leoprover/scala-tptp-parser.git"
    )),
    developers := List(
      Developer(
        "lex-lex",
        "Alexander Steen",
        "alx.steen@gmail.com",
        url("https://www.alexandersteen.de/")
      )
    ),
    licenses += "MIT" -> url("https://opensource.org/licenses/MIT"),
    sonatypeCredentialHost := "s01.oss.sonatype.org",

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test",

    Compile / doc / scalacOptions ++= Seq(
      "-doc-title", "Scala TPTP parser",
      "-doc-root-content", (Compile / resourceDirectory).value + "/rootdoc.txt"
    )
  )
