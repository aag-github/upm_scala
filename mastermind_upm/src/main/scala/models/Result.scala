package models

class Result(dead : Int, injured : Int) {
  val dead_ : Int = dead
  val injured_ : Int = injured

  def this() =
    this(0, 0)

  def this(values :(Int, Int)) =
    this(values._1, values._2)

  private def calculateValues(secret: List[Char], proposed: List[Char], acc : (Int, List[Char], List[Char])) : (Int, Int) = {
    def calculateInjured(secret: List[Char], proposed: List[Char], acc : Int ) : Int = {
      (secret.sorted, proposed.sorted) match {
        case (Nil, _) => acc
        case (_, Nil) => acc
        case (secret, proposed) if secret.head == proposed.head => calculateInjured(secret.tail, proposed.tail, acc + 1)
        case (secret, proposed) => if (secret.head < proposed.head) calculateInjured( secret.tail, proposed, acc)
                                   else calculateInjured( secret, proposed.tail, acc)
      }
    }

    (secret, proposed) match {
      case (Nil, Nil) => (acc._1, calculateInjured(acc._2, acc._3, 0))
      case (secret, proposed) => if (secret.head == proposed.head) calculateValues(secret.tail, proposed.tail, (acc._1 + 1, acc._2, acc._3))
                                 else calculateValues(secret.tail, proposed.tail, (acc._1, secret.head :: acc._2, proposed.head :: acc._3))
    }
  }

  def calculated(proposedCombination : List[Char], secretCombination : List[Char]) : Result = {
    new Result(calculateValues(secretCombination, proposedCombination, (0, Nil, Nil)))
  }
}
