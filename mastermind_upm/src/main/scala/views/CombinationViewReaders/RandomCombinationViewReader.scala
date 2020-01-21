package views.CombinationViewReaders

import models.{SecretCombination}
import views.{CombinationViewReader, GestorIO}

object RandomCombinationViewReader extends CombinationViewReader {
  override def read() : String = {
    val chars = SecretCombination.getRandomCombination()
    chars.fold("")(_.toString+_.toString).toString
  }
}
