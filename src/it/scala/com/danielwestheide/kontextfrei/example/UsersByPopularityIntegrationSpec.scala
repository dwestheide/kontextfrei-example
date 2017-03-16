package com.danielwestheide.kontextfrei.example

import org.apache.spark.rdd.RDD

class UsersByPopularityIntegrationSpec
    extends IntegrationSpec
    with UsersByPopularityProperties[RDD] {
  override val logic = new JobLogic[RDD]
}
