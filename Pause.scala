package hr.element.xsbt

import sbt._
import Keys._

object Pause extends Plugin {
  override lazy val settings = Seq(
    commands ++= Seq(
      pauseCommand,
      pauseCommandWithMessage
    )
  )

  lazy val pauseCommand =
    Command.command("pause") { state =>
    SimpleReader.readLine("Paused, press [ENTER] to continue ... ")
    state
  }

  lazy val pauseCommandWithMessage =
    Command.single("prompt") { (state, message) =>
    SimpleReader.readLine(message)
    state
  }
}
