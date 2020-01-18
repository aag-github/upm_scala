import models.{Game, SecretCombination}
import views.{CombinationView, GameView, GestorIO}

object Main {
  def main(args: Array[String]): Unit = {
    var game = new Game(Nil, new SecretCombination())
    do {
      GameView.write(game)
      game = game.addedProposedCombination(CombinationView.read().toList)
    } while (!game.finished)
    if (game.win) GestorIO.writeln("You win.")
    else CombinationView.write(game.secretCombination_, "You lose. Solution: ")
  }
}