package models

object Combination {
  val COLORS = List('R', 'G', 'B', 'Y', 'O', 'M')
  val MAX_COLORS = COLORS.length
}

class Combination(list : List[Char]) {
  val list_ = list
}
