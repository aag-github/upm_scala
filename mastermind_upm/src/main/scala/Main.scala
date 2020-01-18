import models.{Game, SecretCombination}
import views.{CombinationView, GameView, GestorIO}

object Main {
// Version imperativa
/*
  def main(args: Array[String]): Unit = {
    var game = new Game(Nil, new SecretCombination())
    do {
      GameView.write(game)
      game = game.addedProposedCombination(CombinationView.read().toList)
    } while (!game.finished)
    if (game.win) GestorIO.writeln("You win.")
    else CombinationView.write(game.secretCombination_, "You lose. Solution: ")
  }
*/

// Version no imperativa
  def main(args: Array[String]): Unit = {
    def loop(game : Game) : Game = {
      GameView.write(game)
      game.addedProposedCombination(CombinationView.read().toList) match {
        case game if game.finished => game
        case game => loop(game)
      }
    }

    loop(new Game(Nil, new SecretCombination())) match {
      case game if game.win => GestorIO.writeln("You win.")
      case game => CombinationView.write(game.secretCombination_, "You lose. Solution: ")
    }
  }
}