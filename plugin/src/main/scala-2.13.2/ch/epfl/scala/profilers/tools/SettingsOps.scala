package ch.epfl.scala.profilers.tools

import scala.tools.nsc.Global
import scala.reflect.internal.util.StatisticsStatics

trait SettingsOps {
  def areStatisticsEnabled(g: Global): Boolean =
    StatisticsStatics.areSomeColdStatsEnabled() && g.statistics.areStatisticsLocallyEnabled
}
