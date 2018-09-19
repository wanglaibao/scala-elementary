package com.laibao.chapter1

class Car extends Vehicle{

  def start = {
      println("before starting")
      checkEngine();
  }

  def tow(car: Car): Unit = {
     car.checkEngine();
  }

  /**
    *
[INFO] excludes = []
[INFO] D:\IdeaProjects\git\scala-elementary\src\main\scala:-1: info: compiling
[INFO] Compiling 14 source files to D:\IdeaProjects\git\scala-elementary\target\classes at 1537333883100
[ERROR] D:\IdeaProjects\git\scala-elementary\src\main\scala\com\laibao\chapter1\Car.scala:15: error: method checkEngine in class Vehicle cannot be accessed in com.laibao.chapter1.Vehicle
[INFO]  Access to protected method checkEngine not permitted because
[INFO]  prefix type com.laibao.chapter1.Vehicle does not conform to
[INFO]  class Car in package chapter1 where the access takes place
[INFO]       vehicle.checkEngine();
[ERROR] one error found
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
    */
  def tow(vehicle: Vehicle) : Unit = {
      //vehicle.checkEngine();
      vehicle.horn()
  }
}
