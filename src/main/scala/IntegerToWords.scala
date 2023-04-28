package com.knoldus
import com.typesafe.scalalogging.Logger
import scala.annotation.tailrec

object IntegerToWords extends App{
  private def fullWords(number: Int): String = {
    @tailrec
    def helper(num: Int, accmulator: String): String = {
      val remainder = num % 10
      val word = remainder match {
        case 0 => "Zero"
        case 1 => "One"
        case 2 => "Two"
        case 3 => "Three"
        case 4 => "Four"
        case 5 => "Five"
        case 6 => "Six"
        case 7 => "Seven"
        case 8 => "Eight"
        case 9 => "Nine"
      }
      val newAccumulator = if (accmulator.isEmpty) word else word + " " + accmulator
      if (num < 10) newAccumulator else helper(num / 10, newAccumulator)
    }
    helper(number, "")
  }
  val logger = Logger(getClass)
  logger.info("Integer in to words : " + fullWords(231))
}
