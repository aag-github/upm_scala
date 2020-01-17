import models.{Game, SecretCombination}
import views.{CombinationView, GameView, GestorIO}

object Main {
  def main(args: Array[String]): Unit = {
    var game = new Game(Nil, new SecretCombination())
    game = game.addedProposedCombination("AAAAAA".toList)
    game = game.addedProposedCombination("BBBBBB".toList)
    do {
      GameView.write(game)
      game = game.addedProposedCombination(CombinationView.read().toList)
    } while (!game.finished)
    if (game.win) GestorIO.writeln("Has ganado")
    else CombinationView.write(game.secretCombination_, "Has perdido. Solución: ")
  }
}