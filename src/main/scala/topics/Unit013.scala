package topics

object Unit013 {

  /* nums is a useful list of numbers to use in the exercises */
  val nums: List[Int] = (1 to 10).toList


  def incr(x: Int): Int = x + 1
  def add(x: Int)(y: Int): Int = x + y
  /* Exercise 14 code */

  @main def exercise14(): Unit =
    println(nums.map(new Function1[Int, Int] {
      override def apply(x: Int): Int = incr(x)
    }))
    println(nums.map(x => incr(x)))
    println(nums.map(x => x + 1))
    println(nums.map(incr))
    println(nums.map(add(1)))
    
    

}
