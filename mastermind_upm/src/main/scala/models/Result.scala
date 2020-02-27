package models

object Result {
  private def calculateColorMatches(secret: List[Char], proposed: List[Char], acc : Int ) : Int =
    (secret.sorted, proposed.sorted) match {
      case (Nil, _) => acc
      case (_, Nil) => acc
      case (secret, proposed) if (secret.head == proposed.head) => calculateColorMatches(secret.tail, proposed.tail, acc + 1)
      case (secret, proposed) if (secret.head < proposed.head) => calculateColorMatches(secret.tail, proposed, acc)
      case (secret, proposed) if (secret.head > proposed.head) => calculateColorMatches(secret, proposed.tail, acc)
    }

  private def calculateFullMatches(secret: List[Char], proposed: List[Char], acc : Int) : Int =
    (secret, proposed) match {
      case (Nil, Nil) => acc
      case (secret, proposed) => calculateFullMatches(secret.tail, proposed.tail, acc + (if (secret.head == proposed.head) 1 else 0))
    }

  private def getResult(fullMatches : Int, colorMatches : Int) : Result =
    new Result(fullMatches, colorMatches - fullMatches)

  def calculate(secretCombination : List[Char], proposedCombination : List[Char]) : Result = {
    require(proposedCombination.length == secretCombination.length)
    require(proposedCombination.length == Combination.LENGTH)
    getResult(calculateFullMatches(secretCombination, proposedCombination, 0), calculateColorMatches(secretCombination, proposedCombination, 0))
  }
}

class Result(dead : Int, injured : Int) {
  val dead_ : Int = dead
  val injured_ : Int = injured

  def this(values :(Int, Int)) =
    this(values._1, values._2)

  def win() =
    dead_ == Combination.LENGTH && injured_ == 0
}
