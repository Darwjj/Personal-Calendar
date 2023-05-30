package topics

object Unit01 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList


  /* Exercise 11 code */

  def incr(x: Int): Int = x + 1

  def decr(x: Int): Int = x - 1

  def dbl(x: Int) = x * 2

  def half(x: Int) = x / 2

  def sq(x: Int) = x * x

  def cb(x : Int) = x * x * x

  def ng(x : Int) = -x

  def mint(x : Int) = x / 60

  @main def exerise11(): Unit =
    println(incr(1))
    println(incr(incr(1)))
    println(decr(1))
    println(decr(decr(1)))
    println(dbl(1))
    println(dbl(dbl(1)))
    println(half(ng(cb(2))))
    println(half(2))
    println(sq(2))
    println(cb(2))
    println(mint(120))


}
