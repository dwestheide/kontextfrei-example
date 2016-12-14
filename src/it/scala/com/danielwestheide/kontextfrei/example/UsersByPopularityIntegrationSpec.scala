package com.danielwestheide.kontextfrei.example

import com.danielwestheide.kontextfrei.{DCollectionOps, RDDCollectionOps}
import org.apache.spark.rdd.RDD

class UsersByPopularityIntegrationSpec extends IntegrationSpec with UsersByPopularityProperties[RDD] {
  override implicit val ops: DCollectionOps[RDD] = RDDCollectionOps.rddCollectionOps
  override val logic = new JobLogic[RDD]
}
