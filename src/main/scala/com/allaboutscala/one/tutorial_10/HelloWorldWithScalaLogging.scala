package com.allaboutscala.one.tutorial_10
import com.typesafe.scalalogging.LazyLogging

// http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/getting-started-sbt-import-dependencies-build-sbt/

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("Hello World from Scala Logging")
}
