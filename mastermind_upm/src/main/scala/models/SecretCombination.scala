package models

object SecretCombination {
  val r = new scala.util.Random(System.currentTimeMillis().toInt)

  def getRandomCombination() : List[Char] = {
    val colors = List('R', 'G', 'B', 'Y', 'O', 'M')
    (1 to Combination.MAX_LEN).map(_ => colors(r.nextInt(colors.length))).toList
  }
}

class SecretCombination(list : List[Char]) extends Combination(list) {
  def this() =
    this(SecretCombination.getRandomCombination())
}
