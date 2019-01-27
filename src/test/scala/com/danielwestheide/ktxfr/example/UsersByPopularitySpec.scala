package com.danielwestheide.ktxfr.example

class UsersByPopularitySpec extends UnitSpec with UsersByPopularityProperties[Stream] {
  override val logic = new JobLogic[Stream]
}
