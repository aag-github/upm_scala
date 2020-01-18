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

}
