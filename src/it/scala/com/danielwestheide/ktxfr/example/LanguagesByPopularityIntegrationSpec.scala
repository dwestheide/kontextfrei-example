package com.danielwestheide.ktxfr.example

import org.apache.spark.rdd.RDD

class LanguagesByPopularityIntegrationSpec extends IntegrationSpec with LanguagesByPopularityProperties[RDD] {
  override val logic = new JobLogic[RDD]
}
