package models

class ProposedCombination(list : List[Char], result : Result ) extends Combination(list) {
  val result_ = result
}
