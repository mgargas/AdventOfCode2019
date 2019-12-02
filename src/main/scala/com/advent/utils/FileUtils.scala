package com.advent.utils

import scala.io.Source

object FileUtils {
  def readResource(resource: String): Seq[String] =
    Source.fromInputStream(getClass.getClassLoader.getResourceAsStream(resource)).getLines().toSeq
}
