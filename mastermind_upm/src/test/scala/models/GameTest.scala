package models

import org.scalatest.FunSuite

class GameTest extends FunSuite {
  test("not win on empty game") {
    val game = new Game(Nil, new SecretCombination(List('R','G','B')))

    assert(game.win == false)
  }

  test("not win on not empty game") {
    val game = new Game(Nil, new SecretCombination(List('R','G','B')))
    val gameToTest = game.addedProposedCombination(List('R','G','H'))

    assert(gameToTest.combinations_.length == 1)
    assert(gameToTest.win == false)
  }

  test("win") {
    val game = new Game(Nil, new SecretCombination(List('R','G','B')))
    val gameToTest = game.addedProposedCombination(List('R','G','B'))

    assert(gameToTest.combinations_.length == 1)
    assert(gameToTest.win == true)
  }

  test("not finished") {
    val game = new Game(Nil, new SecretCombination(List('R','G','B')))

    assert(game.finished == false)
  }

  test("finished") {
    val game = new Game(Nil, new SecretCombination(List('R','G','B')))
    val gameToTest = game.addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','G','B'))
      .addedProposedCombination(List('R','H','G'))

    assert(gameToTest.combinations_.length == 10)
    assert(gameToTest.finished == true)
  }

  }
