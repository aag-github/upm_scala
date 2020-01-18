package models
import org.scalatest.FunSuite

class ResultTest extends FunSuite {
  test("calculation zero") {
    val result = Result.calculate("RGBYYY".toList, "OPQOPQ".toList)
    assert(result.dead_ == 0)
    assert(result.injured_ == 0)
  }

  test("calculation zero dead") {
    val result = Result.calculate("RGBYYY".toList, "OOOOGR".toList)
    assert(result.dead_ == 0)
    assert(result.injured_ == 2)
  }

  test("calculation 1 dead 2 injured") {
    val result = Result.calculate("RGBYYY".toList, "ROGBOO".toList)
    assert(result.dead_ == 1)
    assert(result.injured_ == 2)
  }

  test("calculation all dead") {
    val result = Result.calculate("RGBYYY".toList, "RGBYYY".toList)
    assert(result.dead_ == 6)
    assert(result.injured_ == 0)
  }

  test("precondition length") {
    try {
      val colors = "RGBYY".toList // wrong length
      Result.calculate(colors, colors)
      assert(false)
    }
    catch {
      case _: IllegalArgumentException => // Expected, so continue
    }
  }

  test("precondition same length") {
    try {
      val colors1 = "RGBYY".toList // length mismatch
      val colors2 = "RGBYYY".toList
      Result.calculate(colors1, colors2)
      assert(false)
    }
    catch {
      case _: IllegalArgumentException => // Expected, so continue
    }
  }

}
