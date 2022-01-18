package ch.epfl.scala.profilers.tools

import scala.tools.nsc.Global

trait SettingsOps {
  def areStatisticsEnabled(g: Global): Boolean =
    g.settings.areStatisticsEnabled
}
