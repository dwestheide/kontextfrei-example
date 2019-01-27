package com.danielwestheide.ktxfr.example

import com.danielwestheide.kontextfrei.scalatest.RDDSpec
import org.apache.spark.rdd.RDD

abstract class IntegrationSpec extends BaseSpec[RDD] with RDDSpec