package com.laibao.chapter1
import java.util.ArrayList
object OptionalSemicolon {

  def main(args: Array[String]): Unit = {
    val list1 = new ArrayList[Int];
    {
      println("Created list1")
    }

    val list2 = new ArrayList[Int]
    {
      println("Created list2")
    }

    println(list1.getClass)
    println(list2.getClass)
  }
}
