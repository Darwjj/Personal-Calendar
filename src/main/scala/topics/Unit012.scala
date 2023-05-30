package topics

import java.util.Comparator

object Unit012 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList

  /* Exercise 13 code */

  def sub(x: Int)(y: Int): Int = x - y

  def mul(x: Int)(y: Int): Int = x * y

  def div(x: Int)(y: Int): Int = x / y

  def divBy(x: Int)(y: Int): Int = y / x

  @main def exercise13(): Unit =
    println(s"sub(8)(5) = ${sub(8)(5)}")
    println(s"sub(5)(8) = ${sub(5)(8)}")
    println(s"mul(9)(7) = ${mul(9)(7)}")
    println(s"div(32)(7) = ${div(32)(7)}")
    println(s"divBy(5)(15) = ${divBy(5)(15)}")
    println(nums.map(mul(2)))

  /* subBy subtracts the first argument from the second */
  def subBy(x: Int)(y: Int): Int = y - x

  /* smaller returns the smaller of the two arguments */
  def smaller(x: Int)(y: Int): Int = java.lang.Math.min(x,y)

  /* balance returns -1 if x < y; 0 if equal; 1 if x > y */
  def balance(x: Int)(y: Int): Int = {
    if (x < y) {
      -1
    } else if (x > y) {
      1
    } else {
      0
    }
  }

  @main def exercise13b(): Unit =
    println(s"subBy(8)(5) = ${subBy(8)(5)}")
    println(s"smaller(7)(3) = ${smaller(7)(3)}")
    println(s"balance(9)(5) = ${balance(9)(5)}")
    println(s"balance(2)(5) = ${balance(2)(5)}")
    println(s"balance(5)(5) = ${balance(5)(5)}")
    println(nums.map(subBy(10)))
    println(nums.map(smaller(6)))
    println(nums.map(balance(6)))

}
