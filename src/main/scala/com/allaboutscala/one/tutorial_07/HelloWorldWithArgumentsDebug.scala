package com.allaboutscala.one.tutorial_07

// http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-debug-configuration-scala-application/

object HelloWorldWithArgumentsDebug extends App {
  println("Hello World With Arguments Scala Application!")
  println("Command line arguments are: ")
  println(args.mkString(". "))
}

