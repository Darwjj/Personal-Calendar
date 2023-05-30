package topics

object Unit011 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList


  /* Exercise 12 code */

  def add(x: Int)(y: Int): Int = x + y

  def incr(x: Int): Int = x + 1

  def plus(x: Int, y: Int): Int = x + y

  @main def exercise12(): Unit =
    println(add(2)(5))
    println(add(2)(0))
    println(plus(2, 5))
    println(plus(2, 0))

  @main def exercise12b(): Unit =
    println(nums)
    println(nums.map(incr))
    println(nums.map(add(1)))
    println(nums.map(add(100)))


}
