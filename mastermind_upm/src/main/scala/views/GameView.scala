package views

import models.Game
import views.io.GestorIO

object GameView {
  def write(game:Game) = {
    GestorIO.writeln("--- GAME STATUS ---");
    ProposedCombinationsView.write(game.combinations_)
  }
}
