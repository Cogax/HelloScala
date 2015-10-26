/**
 * Created by Andreas Gyr on 20.10.2015.
 */

object HelloScala {
  def main(args: Array[String]) {

    val testFunc: // testFunc is a function which..
    (Int) // ..takes a single parameter of type Int
      => Int // ..returns a value of type Int
    = // It's implementation is as follows:
      (x) // the parameter will be named x
      => x + 1 // it will return x + 1

    println(testFunc(2));
  }
}
