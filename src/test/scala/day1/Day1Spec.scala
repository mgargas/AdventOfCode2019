package day1

import com.advent.day1.Day1
import org.scalatest.flatspec.AnyFlatSpec
class Day1Spec extends AnyFlatSpec {
  it should "calculate fuel for module" in {
    assert(Day1.fuelForModule(12) == 2)
    assert(Day1.fuelForModule(14) == 2)
    assert(Day1.fuelForModule(1969) == 654)
    assert(Day1.fuelForModule(100756) ==  33583)
  }
  it should "calculate fuel for module if fuel weights" in {
    assert(Day1.fuelForModule2(14) == 2)
    assert(Day1.fuelForModule2(1969) == 966)
    assert(Day1.fuelForModule2(100756) ==  50346)
  }
}
