package com.laibao.chapter1

object Equality {

  def main(args: Array[String]): Unit = {
      val str1 = "hello,world"

      val str2 = "hello,world"

      val str3 = new String("hello,world")

      println(str1 == str2)

      println(str1 == str3)

      println(str1.eq(str2))

      println(str1.eq(str3))

      println(str1.equals(str2))

      println(str1.equals(str3))
  }
}
