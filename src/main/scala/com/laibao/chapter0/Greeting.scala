package com.laibao.chapter0

/**
  * @author laibao wang
  * @since 2018-09-16
  * @version 1.0
  */
object Greeting extends App{
  /**
    * 字符串表达式： s"...${expression}..."
    */
  for (i <- 1 to 4) {
    print(s"$i ,")
  }
  println("Scala Rocks")

  for (j <- 1 until  100) {
    print(s"$j ,")
  }
  println()

}
