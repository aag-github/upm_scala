package models
import org.scalatest.FunSuite

class ResultTest extends FunSuite {
  test("calculation zero") {
    val result = new Result().calculated(List('R', 'G', 'B'), List('O', 'P', 'Q'))
    assert(result.dead_ == 0)
    assert(result.injured_ == 0)
  }

  test("calculation zero dead") {
    val result = new Result().calculated(List('O', 'P', 'G'), List('R', 'G', 'B'))
    assert(result.dead_ == 0)
    assert(result.injured_ == 1)
  }

  test("calculation 1 dead 2 injured") {
    val result = new Result().calculated(List('R', 'G', 'B'), List('B', 'G', 'R'))
    assert(result.dead_ == 1)
    assert(result.injured_ == 2)
  }

  test("calculation all dead") {
    val result = new Result().calculated(List('R', 'G', 'B'), List('R', 'G', 'B'))
    assert(result.dead_ == 3)
    assert(result.injured_ == 0)
  }

}
