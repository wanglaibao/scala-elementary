package com.laibao.chapter1

object AvoidExplicitReturn {

  def main(args: Array[String]): Unit = {
    def check1 = true
    // return 会影响Scala的类型推断能力
    def check2 : Boolean = return true
    def check3 : Boolean = true

    println(check1)
    println(check2)
    println(check3)
  }
}
