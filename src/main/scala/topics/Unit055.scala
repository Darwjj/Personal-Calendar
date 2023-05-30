package topics

object Unit055 {

  /*
   * Exercise 56
   * Insert sort can be implemented by folding the following insertion
   * function (method) over the list.
   */

  def ins(x: Int, xs: List[Int]): List[Int] = xs match
    case Nil => List(x)
    case y :: ys => if x <= y then x :: y :: ys else y :: ins(x, ys)

  extension (ys: List[Int])
    def isort: List[Int] = ys.foldRight(Nil)(ins)

  @main def exercise56aa(): Unit =
    println(List(5, 2, 9, 4, 8, 6, 7, 1, 3, 0).isort)
}
