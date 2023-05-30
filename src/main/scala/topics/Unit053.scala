package topics
import scala.collection.parallel.CollectionConverters._

object Unit053 {

  /*
   * Exercise 53
   *
   * When you might use foldRight instead of foldLeft...
   * (a) When the conditions for interchangeability are satisfied
   * (b) When the cost of evaluating op increases as its left argument does
   * 		 (e.g. list concatenation xs:::ys which is proportional to the
   *     length of xs. Thus (xs:::ys):::zs takes longer to evaluate than
   *     xs:::(ys:::zs). If each of these lists is of length N (say), then
   *     the first case takes N+2N = 3N steps whereas the second case takes
   *     N+N = 2N steps. This may not seem like a big difference, but over
   *     a list of lists the difference is compounded.)
   *
   * Run the following experiment and note the results. Try increasing the
   * size of the longList to get a more dramatic difference. Start with
   * 25000 and try a few other values until you appreciate the scale of it.
   */

  val longList: List[Long] = (1L to 20000L).toList
  val longListList: List[List[Long]] = longList.map(List[Long](_))
  val veryLongVector: Vector[Long] = (1L to 100000000L).toVector

  @main def exercise53aaa(): Unit =
    println(longListList take 10)
    val t0: Long = System.nanoTime()
    val fl: List[Long] = longListList.foldLeft(List[Long]())(_ ::: _)
    val t1: Long = System.nanoTime()
    println(s"Left folding:  Display first ten:\n${fl.take(10)}...\nTook ${(t1 - t0) / 1000000L} milliseconds")

  @main def exercise53bbb(): Unit =
    println(longListList take 10)
    val t0: Long = System.nanoTime()
    val fr: List[Long] = longListList.foldRight(List[Long]())(_ ::: _)
    val t1: Long = System.nanoTime()
    println(s"Right folding: Display first ten:\n${fr.take(10)}...\nTook ${(t1 - t0) / 1000000L} milliseconds")

  @main def exercise53ccc(): Unit =
    println(veryLongVector take 10)
    val t0: Long = System.nanoTime()
    val s1: Long = veryLongVector.foldLeft(0L)((_: Long) + (_: Long))
    val t1: Long = System.nanoTime()
    println(s"Left folding:  sum:\n$s1 \nTook ${(t1 - t0) / 1000000L} milliseconds")

  @main def exercise53ddd(): Unit =
    println(veryLongVector take 10)
    val t0: Long = System.nanoTime()
    val s1: Long = veryLongVector.foldRight(0L)((_: Long) + (_: Long))
    val t1: Long = System.nanoTime()
    println(s"Left folding:  sum:\n$s1 \nTook ${(t1 - t0) / 1000000L} milliseconds")

  @main def exercise53eee(): Unit =
    /*
    You will need to add the following line to build.sbt and load the sbt changes
    before you can import the CollectionConverters library.
    libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
    */
    val veryLongParVector = veryLongVector.par
    println(veryLongVector take 10)
    val t0: Long = System.nanoTime()
    val s1: Long = veryLongParVector.fold(0L)((_: Long) + (_: Long))
    val t1: Long = System.nanoTime()
    println(s"Left folding:  sum:\n$s1 \nTook ${(t1 - t0) / 1000000L} milliseconds")

}
