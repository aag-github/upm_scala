package models

object Combination {
  val COLORS_STRING = "RGBYOW"
  val COLORS_LIST = COLORS_STRING.toList
  val MAX_COLORS = COLORS_LIST.length
  val LENGTH = 6
}

class Combination(list : List[Char]) {
  require(list.length == Combination.LENGTH)
  val list_ = list
}
