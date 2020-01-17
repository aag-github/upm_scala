package models

object SecretCombination {
  val r = new scala.util.Random(System.currentTimeMillis().toInt)

  def getRandomCombination() : List[Char] =
    (1 to Combination.MAX_COLORS).map(_ => Combination.COLORS(r.nextInt(Combination.MAX_COLORS))).toList
}

class SecretCombination(list : List[Char]) extends Combination(list) {
  def this() =
    this(SecretCombination.getRandomCombination())
}
