package topics
import java.io.File
import scala.io.Source
import scala.io.{BufferedSource, Source}

object Unit04 {
  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val charList: List[Char] = ('a' to 'z').toList
  val aardvark: List[Char] = "aardvark".toList
  val intList: List[Int] = (0 to 9).toList
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

  @main def exercise41(): Unit =
    lazy val a = ???
    lazy val b = ???
    lazy val c = ???
    lazy val d = ???
    lazy val e = ???
    lazy val f = ???
    lazy val g = ???
    lazy val h = ???
    lazy val i = ???
    lazy val j = ???

  //    println(a)
  //    println(b)
  //    println(c)
  //    println(d)
  //    println(e)
  //    println(f)
  //    println(g)
  //    println(h)
  //    println(i)
  //    println(j)
  /*
   * Exercise 42
   * Re-write the answers to exercise 41(a)-(g) only use map and filter
   * instead of list comprehensions. For example, the first one (a) is
   * done for you.
   * Sometimes the compiler may need a little assistance to determine a
   * parameter type.
   */

  @main def exercise42(): Unit =
    lazy val a = intList map (i => i * i)
    lazy val b = ???
    lazy val c = ???
    lazy val d = ???
    lazy val e = ???
    lazy val f = ???
    lazy val g = ???

  //    println(a)
  //    println(b)
  //    println(c)
  //    println(d)
  //    println(e)
  //    println(f)
  //    println(g)

  /*
   * Exercise 43
   *
   * Use zip to construct the following lists. You may use other list
   * methods where this might be helpful. You should also make use of
   * the pre-defined lists from the top of this file.
   * (a) List((a,a), (e,e), (i,i), (o,o), (u,u))
   * (b) List((0,a), (1,a), (2,r), (3,d), (4,v), (5,a), (6,r), (7,k))
   * (c) List((a,e), (e,i), (i,o), (o,u))
   * (d) List((The,jumped), (quick,over), (brown,the), (fox,lazy))
   * (e) List((a,A), (e,E), (i,I), (o,O), (u,U))
   * (f) List(((0,T),The), ((1,q),quick), ((2,b),brown), ((3,f),fox), ((4,j),jumped))
   * (g) List(((The,quick),brown), ((quick,brown),fox), ((brown,fox),jumped),
   *          ((fox,jumped),over), ((jumped,over),the), ((over,the),lazy),
   *          ((the,lazy),dog))
   */
  @main def exercise43(): Unit =
    lazy val a = ???
    lazy val b = ???
    lazy val c = ???
    lazy val d = ???
    lazy val e = ???
    lazy val f = ???
    lazy val g = ???

  //    println(a)
  //    println(b)
  //    println(c)
  //    println(d)
  //    println(e)
  //    println(f)
  //    println(g)
  /*
   * Variations: We leave you to look up zipAll which runs to the
   * length of the longest list using a supplied default value as
   * padding. Thus
   *   List(1, 2, 3, 4, 5).zipAll(List('a', 'b'), 0, 'x')
   * = List((1,a), (2,b), (3,x), (4,x), (5,x))
   * and
   *   List(1, 2).zipAll(List('a', 'b', 'c', 'd'), 0, 'x')
   * = List((1,a), (2,b), (0,c), (0,d))
   *
   * Try some of your own experiments with zipAll using the Scala
   * interpreter (REPL).
   */
  
  
  /*
   * Exercise 44
   */

  def keepOnlyAlpha(xs: String): String =
    val alpha: Seq[Char] = ('a' to 'z') ++ ('A' to 'Z')
    xs.filter(alpha contains _)

  def toLines(xs: String): List[String] =
    xs.split(System.lineSeparator()).toList

  def toWords(xs: String): List[String] =
    xs.split("\\s+").toList

  @main def exercise44(): Unit =
    val poem0: String =
    // extract from "The Tyger" by William Blake
      """Tyger! Tyger! burning bright
        |In the forests of the night,
        |What immortal hand or eye
        |Could frame thy fearful symmetry?
        |""".stripMargin

    val poem1: String =
    // extract from "And Still I Rise" by Maya Angelou
      """You may shoot me with your words,
        |You may cut me with your eyes,
        |You may kill me with your hatefulness,
        |But still, like air, I’ll rise.
        |""".stripMargin

    val poem2: String =
    // extract from "Do Not Go Gentle Into That Goodnight" by Dylan Thomas
      """Do not go gentle into that goodnight,
        |Old age should burn and rage at close of day;
        |Rage, rage against the dying of the light.
        |""".stripMargin

    val poems: List[String] = List(poem0, poem1, poem2)

    poems.zipWithIndex foreach { (p, i) =>
      val allLinesStartWithCap = toLines(p) map (_.head) forall (_.isUpper)
      println(s"Poem $i: all lines start with a capital letter = $allLinesStartWithCap")
    }

  // Analyse poems to determine whether or not each contains a palindrome
  // Analyse poems to determine whether or not each contains a line with
  // a repeated word

  /*
   * Exercise 45
   *
   * The code in the following example gets the filenames of the
   * Scala programs in the topics folder. The variable CODE_PATH
   * holds the relative pathname of the topics folder.
   */
  @main def exercise45(): Unit = {

    // val CODE_PATH = "src/topics" // use this version with Eclipse
    val CODE_PATH = "src/main/scala/topics" // use this version with IntelliJ
    val scalaFiles: List[File] = new java.io.File(CODE_PATH).listFiles.toList

    /*
     * Print out what we've found. Note that scalaPrograms is a
     * list of strings so to print them out vertically on the
     * console we use mkString("\n") which builds a string from
     * a list of strings by inserting a newline at the end of
     * each individual string and then concatenating the results
     * together.
     */
    println(scalaFiles.mkString("\n"))

    /*
     * Print out the absolute pathnames so we can see exactly
     * where they are located on the file system.
     */
    println(scalaFiles.map(_.getAbsolutePath).mkString("\n"))

    /*
     * Print out the sizes of each of the files
     */
    val fileSizes = scalaFiles.map(_.length)
    scalaFiles zip fileSizes foreach println

    /*
     * Print the total number of bytes in all of the files
     */
    println(s"The sum of all the file sizes = ${fileSizes.sum}")

    /*
     * Find the number of main methods defined in each file
     */
    // Enter your solution here
  }



  /*
   * Exercise 46
   *
   */

  extension[A, B, C, D] (abcds: List[(A, B, C, D)])
    def unzip4: (List[A], List[B], List[C], List[D]) = ???

  @main def exercise46(): Unit =
    println(List((0, 3, 6, 9), (1, 4, 7, 0), (2, 5, 8, 1)).unzip4)
}
