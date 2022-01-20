package ch.epfl.scala.profilers.tools

import scala.collection.mutable
import scala.tools.nsc.Global
import scala.reflect.internal.util.Statistics

object QuantitiesHijacker {
  type Quantities = mutable.HashMap[String, Statistics#Quantity]
  def getRegisteredQuantities[G <: Global](global: G): Quantities = {
    val clazz = global.statistics.getClass()
    val field = clazz.getField("scala$reflect$internal$util$Statistics$$qs")
    field.get(global.statistics).asInstanceOf[Quantities]
  }
}
