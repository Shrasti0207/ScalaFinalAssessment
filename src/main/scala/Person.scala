package com.knoldus
import com.typesafe.scalalogging.Logger

case class Person(name: String)

object PersonName extends App{
  val logger = Logger(getClass)
  val name = "Shrasti"
  implicit class printName(name: String) {
    val toPerson: Person = Person(name)
  }
  logger.info("Name of the person : "+name.toPerson)
}


