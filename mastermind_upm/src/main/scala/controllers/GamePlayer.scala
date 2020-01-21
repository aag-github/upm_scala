package controllers

import models.{Game, SecretCombination}
import views.io.GestorIO
import views.{CombinationViewReader, CombinationViewWriter, GameView}

object GamePlayer {
  def play(reader: CombinationViewReader) = {
    def loop(game: Game, reader: CombinationViewReader): Game = {
      GameView.write(game)
      game.addedProposedCombination(reader.read().toList) match {
        case game if game.finished => game
        case game => loop(game, reader)
      }
    }

    loop(new Game(Nil, new SecretCombination()), reader) match {
      case game if game.win => GestorIO.writeln("You win.")
      case game => CombinationViewWriter.write(game.secretCombination_, "You lose. Solution: ")
    }
  }
}
