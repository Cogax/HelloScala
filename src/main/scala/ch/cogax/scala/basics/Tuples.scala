package ch.cogax.scala.basics
/**
  * Created by Andreas Gyr on 27.10.2015.
 */

import ch.cogax.scala.basics.models.Car

object Tuples {
  def main(args: Array[String]) {
    var numbers:(Int, Int) = (3, 5)
    println(numbers._1) // 3
    println(numbers._2) // 5

    var cars:(Car, Car) = (new Car("BMW", 5), new Car("BMW", 5))
    println(cars._1) // obj ref
    println(cars._1.branch) // "BMW"

    val twoInts = (3,5)
    println(twoInts._1) // 3

    val someVals = (3, "Hello", new Car("Mazda", 5))
    println(someVals._2) // "Hello"

    var someThing = ("test", 23)
    someThing = ("test2", 24)
    println(someThing.swap._1) // "24"
    println(someThing._2) // "24"

    def giveMeATuple = (3, 5)
    val(left, right) = giveMeATuple
    println(left) // 3
  }
}
