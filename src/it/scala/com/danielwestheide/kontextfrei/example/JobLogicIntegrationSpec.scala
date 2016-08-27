package com.danielwestheide.kontextfrei.example

import org.apache.spark.rdd.RDD

class JobLogicIntegrationSpec extends RDDSpec
  with LanguagesByPopularityProperties[RDD]
  with UsersByPopularityProperties[RDD] {
  override val logic = new JobLogic[RDD]
}
