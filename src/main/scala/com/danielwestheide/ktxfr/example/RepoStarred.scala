package com.danielwestheide.ktxfr.example

import org.joda.time.DateTime

case class RepoStarred(
  at: DateTime,
  owner: String,
  repo: String,
  starrerId: String
)
