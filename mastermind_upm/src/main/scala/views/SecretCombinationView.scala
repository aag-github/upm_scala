package views

import models.SecretCombination

object SecretCombinationView {
  def write(secretCombination : SecretCombination) = {
    GestorIO.writeln(secretCombination.list_.map(_ => "X").fold("")(_ + _))
  }
}
