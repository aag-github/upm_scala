package views

import models.Combination

object CombinationView {
  def write(combination: Combination, prefix: String) = {
    GestorIO.writeln(toString(combination, prefix))
  }

  def toString(combination: Combination, prefix: String) = {
    prefix + combination.list_.fold("")(_.toString + _.toString)
  }

  def read() : String =
    GestorIO.readString("Introduce una combinación\n")
}
