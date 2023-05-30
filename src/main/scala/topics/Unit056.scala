package topics

object Unit056 {
  /*
   * Exercise 57
  */
  def segments(xs: List[Int]): List[List[Int]] = xs.tails.map(_.inits.toList).toList.flatten

  def mss1(xs: List[Int]): Int = segments(xs).map(_.sum).max

  @main def exercise57aa(): Unit =
    val expt57a = mss1(List(-1, 2, -3, 5, -2, 1, 3, -2, -2, -3, 6))
    println(expt57a)

}
