package models

class Game(combinations : List[ProposedCombination], secretCombination : SecretCombination) {
  val combinations_ = combinations
  val secretCombination_ = secretCombination

  private val MAX_COMBINATIONS = 10

  def addedProposedCombination(list : List[Char]) : Game =
    new Game(new ProposedCombination(list, new Result().calculated(secretCombination.list_, list)) :: combinations_, secretCombination)

  def finished : Boolean =
    combinations_.length == MAX_COMBINATIONS;

  def win : Boolean =
    combinations != Nil && combinations.head.list_.equals(secretCombination_.list_)
}
