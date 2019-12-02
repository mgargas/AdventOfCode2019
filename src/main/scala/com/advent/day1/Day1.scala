package com.advent.day1

import com.advent.AdventDay
import com.advent.utils.FileUtils

import scala.annotation.tailrec

object Day1 extends App with AdventDay[Int, Int] {
  val part1 = FileUtils.readResource("com.advent.day1/part1.txt").map(_.toInt)
  val part2 = FileUtils.readResource("com.advent.day1/part2.txt").map(_.toInt)

  override def solvePart1() = part1.map(fuelForModule).sum

  override def solvePart2() = part2.map(fuelForModule2).sum
  println(solvePart2())
  def fuelForModule(mass: Int): Int = (mass / 3) - 2

  def fuelForModule2(mass: Int): Int = {
    @tailrec
    def iterate(totalFuel: Int, currentMass: Int): Int = {
      if(currentMass == 0) totalFuel
      else {
        val f = math.max(fuelForModule(currentMass), 0)
        iterate(totalFuel + f, f)
      }
    }
    iterate(0, mass)
  }
}
