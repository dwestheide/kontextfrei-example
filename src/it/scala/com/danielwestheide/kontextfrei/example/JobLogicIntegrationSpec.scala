package com.danielwestheide.kontextfrei.example

import org.apache.spark.rdd.RDD

class JobLogicIntegrationSpec extends IntegrationSpec
  with LanguagesByPopularityProperties[RDD]
  with UsersByPopularityProperties[RDD] {
  override val logic = new JobLogic[RDD]
}
