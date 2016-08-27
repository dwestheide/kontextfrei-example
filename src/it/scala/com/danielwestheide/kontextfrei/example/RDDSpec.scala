package com.danielwestheide.kontextfrei.example

import com.danielwestheide.kontextfrei.{DCollectionOps, RDDCollectionOps}
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.scalatest.BeforeAndAfterAll

abstract class RDDSpec extends BaseSpec[RDD] with BeforeAndAfterAll {

  implicit val sparkContext = new SparkContext("local[2]", "my-test")
  override implicit val ops: DCollectionOps[RDD] = RDDCollectionOps.rddCollectionOps
  override protected def afterAll(): Unit = {
    sparkContext.stop()
  }

}
