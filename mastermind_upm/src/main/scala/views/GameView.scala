package views

import models.Game

object GameView {
  def write(game:Game) = {
    GestorIO.writeln("--- GAME ---");
    ProposedCombinationsView.write(game.combinations_)
  }
}
