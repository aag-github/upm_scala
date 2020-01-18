package models

object Combination {
  val COLORS_STRING = "RGBYOW"
  val COLORS = COLORS_STRING.toList
  val MAX_COLORS = COLORS.length
  val LENGTH = 6
}

class Combination(list : List[Char]) {
  require(list.length == Combination.LENGTH)
  val list_ = list
}
