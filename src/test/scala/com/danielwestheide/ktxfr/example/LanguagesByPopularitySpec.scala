package com.danielwestheide.ktxfr.example

class LanguagesByPopularitySpec extends UnitSpec with LanguagesByPopularityProperties[Stream] {
  override val logic = new JobLogic[Stream]
}
