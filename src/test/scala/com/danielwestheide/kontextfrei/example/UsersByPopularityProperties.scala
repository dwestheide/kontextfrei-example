package com.danielwestheide.kontextfrei.example

import com.danielwestheide.kontextfrei.syntax.Imports._

trait UsersByPopularityProperties[DColl[_]] extends BaseSpec[DColl] {

  def logic: JobLogic[DColl]

  property("Each user appears only once") {
    forAll { starredEvents: DColl[RepoStarred] =>
      val result =
        logic.usersByPopularity(starredEvents).collect().toList
      result.distinct mustEqual result
    }
  }

  property("Total counts correspond to number of events") {
    forAll { starredEvents: DColl[RepoStarred] =>
      val result =
        logic.usersByPopularity(starredEvents).collect().toList
      result.map(_._2).sum mustEqual starredEvents.count()
    }
  }

  property("User with maximum stars is the first element in result") {
    forAll { starredEvents: DColl[RepoStarred] =>
      val result =
        logic.usersByPopularity(starredEvents).collect().toList
      result.head mustEqual result.maxBy(_._2)
    }
  }

}
