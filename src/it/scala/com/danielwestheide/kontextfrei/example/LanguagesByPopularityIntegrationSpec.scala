package com.danielwestheide.kontextfrei.example

import org.apache.spark.rdd.RDD

class LanguagesByPopularityIntegrationSpec extends RDDSpec with LanguagesByPopularityProperties[RDD] {
  override val logic = new JobLogic[RDD]
}
