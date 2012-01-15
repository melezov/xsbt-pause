sbtPlugin := true

name := "xsbt-pause"

version := "0.0.1"

organization := "hr.element.xsbt"

publishTo := Some("Element Releases" at "http://maven.element.hr/nexus/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".publish" / "element.credentials")
