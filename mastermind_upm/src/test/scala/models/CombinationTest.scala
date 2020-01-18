package models

import org.scalatest.FunSuite

class CombinationTest extends FunSuite {
  test("precondition length") {
    try {
      val colors = "RGBYY".toList // length mismatch
      new Combination(colors)
      assert(false)
    }
    catch {
      case _: IllegalArgumentException => // Expected, so continue
    }
  }

}
