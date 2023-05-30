package topics

object Unit014 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList
  def sub(x: Int)(y: Int): Int = x - y
  def plus(x: Int, y: Int): Int = x + y
  def div(x: Int)(y: Int): Int = x / y
  def balance(x: Int)(y: Int): Int = {
    if (x < y) {
      -1
    } else if (x > y) {
      1
    } else {
      0
    }
  }
  /* Exercise 15 code */

  @main def exercise15(): Unit =
    println(nums.map(sub(_)(5)))
    println(nums.map(div(_)(2)))

  @main def exercise15b(): Unit =
    println(nums.map(plus(_, 1)))
    println(nums.map(_ + 1))
    println(nums.map(2 * _))
    println(nums.map(balance(_)(6)))


}
