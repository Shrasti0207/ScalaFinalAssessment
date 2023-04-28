package com.knoldus
import com.typesafe.scalalogging.Logger

object AfterTwoDecimalPlace extends App{
  val logger = Logger(getClass)
  val number = 23.653
  logger.info(f"get number After two decimal $number%.2f")
}
