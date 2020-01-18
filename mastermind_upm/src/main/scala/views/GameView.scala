package views

import models.Game

object GameView {
  def write(game:Game) = {
    GestorIO.writeln("--- GAME STATUS ---");
    ProposedCombinationsView.write(game.combinations_)
  }
}
