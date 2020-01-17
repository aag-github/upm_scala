import models.Combination

val colors = List('R', 'G', 'B', 'Y', 'O', 'M')
val r = new scala.util.Random(System.currentTimeMillis().toInt)
colors(0)
(1 to 6).map(_ => r.nextInt(colors.length))
(1 to 6).map(_ => r.nextInt(colors.length))
(1 to 6).map(_ => r.nextInt(colors.length))
(1 to 6).map(_ => r.nextInt(colors.length))
(1 to 6).map(_ => r.nextInt(colors.length))


def getRandomCombination() : List[Char



] = {
  val colors = List('R', 'G', 'B', 'Y', 'O', 'M')
  (1 to Combination.MAX_LEN).map(_ =>colors(r.nextInt(colors.length))).toList
}
  getRandomCombination()
  getRandomCombination()
  getRandomCombination()
  getRandomCombination()
