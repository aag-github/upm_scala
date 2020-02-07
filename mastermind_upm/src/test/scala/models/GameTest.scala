package models

import org.scalatest.FunSuite

class GameTest extends FunSuite {
  def iterateGame(game : Game, proposedCombinations : List[List[Char]]) : Game = {
    if (proposedCombinations != Nil) assert(!game.win && game.attemptsLeft > 0)
    proposedCombinations match {
      case Nil => game
      case list => iterateGame(game.addedProposedCombination(list.head), list.tail)
    }
  }

  test("not win on empty game") {
    val game = new Game(Nil, new SecretCombination("RGBR".toList))

    assert(game.attemptsLeft == 10)
    assert(game.finished == false)
    assert(game.win == false)
  }

  test("not win on not empty game") {
    val game = new Game(Nil, new SecretCombination("RGBR".toList))
    val gameToTest = game.addedProposedCombination("RGBG".toList)

    assert(gameToTest.attemptsLeft == 9)
    assert(gameToTest.finished == false)
    assert(gameToTest.win == false)
  }

  test("finished not win") {
    val combinations = (1 to 10).map(_ => "RGBB".toList).toList
    val game = new Game(Nil, new SecretCombination("RGBR".toList))

    val gameToTest = iterateGame(game, combinations)

    assert(gameToTest.attemptsLeft == 0)
    assert(gameToTest.finished == true)
    assert(gameToTest.win == false)
  }


  test("finished win") {
    val combinations = List("RGBB".toList, "RGBB".toList, "RGBR".toList)
    val game = new Game(Nil, new SecretCombination("RGBR".toList))

    val lastGame = iterateGame(game, combinations)

    assert(lastGame.win)
    assert(lastGame.attemptsLeft == 7)
    assert(lastGame.finished)
  }
}
