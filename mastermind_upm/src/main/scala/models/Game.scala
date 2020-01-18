package models

object Game {
  val MAX_COMBINATIONS = 10
}

class Game(combinations : List[ProposedCombination], secretCombination : SecretCombination) {
  def this() =
    this(Nil, new SecretCombination())

  val combinations_ = combinations
  val secretCombination_ = secretCombination

  def addedProposedCombination(list : List[Char]) : Game =
    new Game(new ProposedCombination(list, Result.calculate(secretCombination.list_, list)) :: combinations_, secretCombination)

  def attemptsLeft : Int =
    Game.MAX_COMBINATIONS - combinations_.length;

  def win : Boolean =
    combinations != Nil && combinations.head.result_.win()

  def finished : Boolean =
    attemptsLeft == 0 || win
}
