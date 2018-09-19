package com.laibao.chapter1


object VehicleTest {

  def main(args: Array[String]): Unit = {
      val vehicle = new Vehicle
      println(vehicle.horn())
      //println(vehicle.checkEngine)

      val car = new Car()
      car.horn()
      car.tow(car)

      car.tow(vehicle)
  }
}
