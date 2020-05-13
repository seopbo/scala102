package com.allaboutscala.one.tutorial_06

// http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-run-configuration-scala-application/

object HelloWorldWithArguments extends App {
  println("Hello World With Arguments Scala Application!")
  println("Command line arguments are: ")
  println(args.mkString(", "))
}
