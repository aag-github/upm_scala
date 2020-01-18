package views

import models.Result

object ResultView {
  def toString(result : Result, prefix: String) : String =
    s"$prefix - D:${result.dead_} I:${result.injured_}"

  def write(result: Result, prefix: String) =
    GestorIO.writeln(toString(result, prefix))
}
