package topics

object Unit016 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList


  def incr(x: Int): Int = x + 1
  def dbl(x: Int) = x * 2


  /* Exercise 17 code */

  val twice: (Int => Int) => (Int => Int) = f => x => f(f(x))
  val twice2: (Int => Int) => (Int => Int) = f => f compose f
  val thrice: (Int => Int) => (Int => Int) = f => x => f(f(f(x)))
  val thrice2: (Int => Int) => (Int => Int) = f => f compose f compose f
  val octo: (Int => Int) => (Int => Int) = f => x => f(f(f(f(f(f(f(f(x))))))))
  val octo2: (Int => Int) => (Int => Int) = f => f compose f compose f compose f compose f compose f compose f compose f

  @main def exercise17(): Unit =
    println(twice(incr)(3))
    println(twice2(dbl)(3))
    println(nums.map(thrice(incr)))
    println(nums.map(thrice2(dbl)))
    println(nums.map(octo(incr)))
    println(nums.map(octo2(dbl)))
    ()


}
