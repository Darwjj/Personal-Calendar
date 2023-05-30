package topics

object Unit041 {

  def dbl(x: Int) = x * x
  def sqr(x: Int) = x * 2
  def pair(x: Int): Boolean = x%2==0
  def incr(x: Int): Int = x + 1
  //def odd(x: Int): Boolean = x == 3
  def equal(y:Int, z:Int): Boolean = y == z
  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val intList: List[Int] = (0 to 9).toList
  val charList: List[Char] = ('a' to 'z').toList
  val aardvark: List[Char] = "aardvark".toList
  val vowels: List[Char] = "aeiou".toList
  val funList: List[Int => Int] = List(_ + 1, _ * 2, _ * 10, _ / 2)

  /*
   * Exercise 41
   * Using list comprehensions (for ...  yield ...), and drawing values
   * from the predefined lists above, construct each of the following:
   * (a) List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
   * (b) List(true, false, true, false, true, false, true, false, true, false)
   * (c) List(A, A, R, D, V, A, R, K)
   * (d) List(11, 20, 100, 5)
   * (e) List(0, 3, 6, 9)
   * (f) List(b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z)
   * (g) List(ehT, depmuj, revo, eht)
   *
   * -- In the following examples, although the lists are output in
   * -- the usual way, List( ..., ..., ..., etc. ), the presentation
   * -- below uses additional layout (spacing, newlines) to highlight
   * -- the patterns that were used to create them.
   *
   * (h) List((a,a), (a,e), (a,i), (a,o), (a,u),
   *          (e,a), (e,e), (e,i), (e,o), (e,u),
   *          (i,a), (i,e), (i,i), (i,o), (i,u),
   *          (o,a), (o,e), (o,i), (o,o), (o,u),
   *          (u,a), (u,e), (u,i), (u,o), (u,u))
   *
   * (i) List(       (a,e), (a,i), (a,o), (a,u),
   *          (e,a),        (e,i), (e,o), (e,u),
   *          (i,a), (i,e),        (i,o), (i,u),
   *          (o,a), (o,e), (o,i),        (o,u),
   *          (u,a), (u,e), (u,i), (u,o)       )
   *
   * (j) List(1,  2,  3,  4,  5,  6,  7,  8,  9, 10,
   *          0,  2,  4,  6,  8, 10, 12, 14, 16, 18,
   *          0, 10, 20, 30, 40, 50, 60, 70, 80, 90,
   *          0,  0,  1,  1,  2,  2,  3,  3,  4,  4)
   */

  @main def exercise41aa(): Unit =
    lazy val a = for x <- intList yield dbl(x)
    lazy val b = for x <- intList yield pair(x)
    lazy val c = aardvark.map(_.toUpper)
    lazy val d = for x <- funList yield x(10)
    lazy val e = intList.map(_*3).take(4)
    lazy val f = charList.filter(!vowels.contains(_))
    lazy val g = wordList.take(1).map(_.reverse):::wordList.take(7).drop(4).map(_.reverse)
    lazy val h = for y<-vowels;z<-vowels yield (y,z)
    lazy val i = for y<-vowels;z<-vowels if !equal(y,z) yield (y,z)
    lazy val j = intList.map(incr(_)):::intList.map(sqr(_)):::intList.map(_*10):::intList.take(1):::intList.take(2):::intList.take(3).drop(1):::
      intList.take(4).drop(2):::intList.take(5).drop(3):::intList.take(5).drop(4)


    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)

}
