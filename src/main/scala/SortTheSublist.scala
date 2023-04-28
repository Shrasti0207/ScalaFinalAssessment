package com.knoldus

import com.typesafe.scalalogging.Logger

object SortTheSublist extends App{
  private val logger = Logger(getClass)
  private val list = List(List('a','h','l'), List('p'), List('i','j','k','l','f'), List('y','q'), List('a','f','r'))
  logger.info("sort the sublist :" +list.sortBy(_.size))
}
