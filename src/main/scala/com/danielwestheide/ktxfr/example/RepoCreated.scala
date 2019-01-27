package com.danielwestheide.ktxfr.example

import org.joda.time.DateTime

case class RepoCreated(
  at: DateTime,
  owner: String,
  name: String,
  mainLanguage: String
)
