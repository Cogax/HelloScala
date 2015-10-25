/**
 * Created by Andreas Gyr on 20.10.2015.
 */

object HelloScala {
  def main(args: Array[String]) {
    println(calc(3, 4, '+'));
    println(calc(3, 4, '.'));
  }

  def calc(val1: Int, val2: Int, operator: Char): Int = {
    return operator match {
      case '+' => val1 + val2
      case '-' => val1 - val2
      case '/' => val1 / val2
      case '*' => val1 * val2
    }
  }
}
