package ch.cogax.scala.basics
/**
  * Created by Andreas Gyr on 20.10.2015.
 */

object Functions {
  def main(args: Array[String]) {

    val testFunc: // testFunc is a function which..
    (Int) // ..takes a single parameter of type Int
      => Int // ..returns a value of type Int
    = // It's implementation is as follows:
      (x) // the parameter will be named x
      => x + 1 // it will return x + 1
    println(testFunc(2)); // 3

    val testFunc2:Int=>Int=x=>x+1; // same example as above
    println(testFunc2(2)) // 3
  }
}
