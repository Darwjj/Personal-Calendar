package topics

object Unit054 {
  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val aardvark: List[Char] = "aardvark".toList
  val numList: List[Int] = List(3, 1, 4, 1, 5, 9, 2, 6, 5)
  val bitList: List[Int] = List(1, 0, 1, 1, 0, 1, 1, 0)
  /*
   * Exercise 54
   * Sometimes it is required to keep all of the partial results of
   * a fold. For this purpose we can use scan.  For example:
   *
   * List(1,2,3).foldLeft(0)(_+_)  = 6
   *  ((0 + 1) + 2) + 3
   *
   * List(1,2,3).foldRight(0)(_+_) = 6
   *   1 + (2 + (3 + 0))
   *
   * List(1,2,3).scanLeft(0)(_+_)  = List(0, 1, 3, 6)
   *   List( 0,  0 + 1,  (0 + 1) + 2,  ((0 + 1) + 2) + 3 )
   *
   * List(1,2,3).scanRight(0)(_+_) = List(6, 5, 3, 0)
   *   List(  1 + (2 + (3 + 0)),  2 + (3 + 0),  3 + 0,  0 )
   *
   * Here are some examples with different types:
   *   aardvark.scanRight(List[Char]())(_::_)
   * = List(List(a, a, r, d, v, a, r, k),
   *        List(a, r, d, v, a, r, k),
   *        List(r, d, v, a, r, k),
   *        List(d, v, a, r, k),
   *        List(v, a, r, k),
   *        List(a, r, k),
   *        List(r, k),
   *        List(k),
   *        List())
   *
   *   List[Int=>Int](_+1, _*2, x => x*x, _/3).scanLeft(identity[Int] _)(_ andThen _)
   * = List($$Lambda$13366/985613394@453b614,
   *        scala.Function1$$Lambda$13368/1605515070@440eff18,
   *        scala.Function1$$Lambda$13368/1605515070@77fddc0a,
   *        scala.Function1$$Lambda$13368/1605515070@39b80e0c,
   *        scala.Function1$$Lambda$13368/1605515070@20c2ec39)
   *   Scala can't print the functions it generated very nicely, but this is the list of
   *   functions they represent:
   *   List(id,
   *        id andThen (_+1),
   *        (id andThen (_+1)) andThen (_*2),
   *        ((id andThen (_+1)) andThen (_*2)) andThen (x => x*x),
   *        (((id andThen (_+1)) andThen (_*2)) andThen (x => x*x)) andThen (_/3))
   *   The example is more interesting if we apply each of these functions to a value:
   *   List[Int=>Int](_+1, _*2, x => x*x, _/3).scanLeft(identity[Int] _)(_ andThen _) map (_(3))
   * = List(3, 4, 8, 64, 21)
   *
   * Using scanLeft or scanRight produce the following lists:
   *
   * (a) The list of factorials from 0 factorial to 9 factorial:
   *     List(1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880)
   *     Use (1 to 9).toList.scanLeft...
   *
   * (b) All the suffixes of the string "0123":
   *     List(0123, 123, 23, 3, "")
   *     Use "0123".toString.scanRight...
   *
   * (c) All the prefixes of the string "0123"
   *     List("", 0, 01, 012, 0123)
   *
   * (d) The integer representations of each of the prefixes of bitList.
   *     i.e. given that bitList represents 10110110 then the result has the
   *     decimal equivalents of
   *     (0, 1,  10, 101, 1011, 10110, 101101, 1011011, 10110110)
   *     The first element represents the base case (an empty byte)
   *     List(0, 1, 2, 5, 11, 22, 45, 91, 182)
   *     Use bitList.scanLeft...
   */
  @main def exercise54aa(): Unit =
    // Examples
    println(List(1, 2, 3).foldLeft(0)(_ + _))
    println(List(1, 2, 3).foldRight(0)(_ + _))
    println(List(1, 2, 3).scanLeft(0)(_ + _))
    println(List(1, 2, 3).scanRight(0)(_ + _))
    println(aardvark.scanLeft(List[Char]())((a, b) => b :: a))
    println(aardvark.scanRight(List[Char]())(_ :: _))
    println(List[Int => Int](_ + 1, _ * 2, x => x * x, _ / 3).scanLeft(identity[Int] _)(_ andThen _))
    println(List[Int => Int](_ + 1, _ * 2, x => x * x, _ / 3).scanLeft(identity[Int] _)(_ andThen _) map (_ (3)))
    //Exercises
    lazy val a = (1 to 9).toList.scanLeft(1)((acc, x) => acc * x)
    lazy val b = "0123".toString.scanRight("")((x, acc) => x + acc)
    lazy val c = "0123".toString.scanLeft("")((x, acc) => x + acc)
    lazy val d = bitList.scanLeft("")((x, acc) => x + acc)
    println(a)
    println(b)
    println(c)
    println(d)

}
