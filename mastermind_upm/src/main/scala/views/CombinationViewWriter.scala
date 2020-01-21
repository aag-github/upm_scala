package views

import models.Combination
import views.io.GestorIO

object CombinationViewWriter {
  def write(combination: Combination, prefix: String) =
    GestorIO.writeln(toString(combination, prefix))

  def toString(combination: Combination, prefix: String) =
    prefix + combination.list_.fold("")(_.toString + _.toString)
}
