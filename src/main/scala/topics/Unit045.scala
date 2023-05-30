package topics

object Unit045 {

  /*
   * Exercise 46
   *
   */

  implicit class Extension[A, B, C, D](abcds: List[(A, B, C, D)]) {
    def unzip4: (List[A], List[B], List[C], List[D]) = {
      val as = abcds.map(_._1)
      val bs = abcds.map(_._2)
      val cs = abcds.map(_._3)
      val ds = abcds.map(_._4)
      (as, bs, cs, ds)
    }
  }


  @main def exercise46aa(): Unit =
    println(List((0, 3, 6, 9), (1, 4, 7, 0), (2, 5, 8, 1)).unzip4)

}
