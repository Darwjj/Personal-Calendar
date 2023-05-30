package topics

object Unit015 {
  
  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList


  def incr(x: Int): Int = x + 1
  def add(x: Int)(y: Int): Int = x + y
  def mul(x: Int)(y: Int): Int = x * y


  /* Exercise 16 code */

  @main def exercise16(): Unit =
    println(nums.map(incr.compose(incr)))
    println(nums.map(add(1).compose(mul(2))))
    println(nums.map(mul(2).compose(add(1))))
    println(nums.map(add(1).andThen(mul(2))))
    println(nums.map(mul(2).andThen(add(1))))


}
