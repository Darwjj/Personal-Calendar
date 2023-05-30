package topics

object Unit042 {
  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val wordList2: List[String] = List("jumped", "over", "the", "lazy")
  val intList: List[Int] = (0 to 9).toList
  val charList: List[Char] = ('a' to 'z').toList
  val aardvark: List[Char] = "aardvark".toList
  val vowels: List[Char] = "aeiou".toList
  val funList: List[Int => Int] = List(_ + 1, _ * 2, _ * 10, _ / 2)
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
  @main def exercise43aa(): Unit =
    lazy val a = vowels.zip(vowels)
    lazy val b = intList.zip(aardvark)
    lazy val c = vowels.zip(vowels.tail)
    lazy val d = wordList.zip(wordList2)
    lazy val e = vowels.zip(vowels.map(_.toUpper))
    lazy val f = wordList.zipWithIndex.map {
      case (word,index) =>((index, word.head.toString), word)
    }
    lazy val g = wordList.zip(wordList.tail)
    lazy val g1 = g.zip(wordList.tail.tail).map(x=>(x._1, x._2)).toList

     println(a)
     println(b)
     println(c)
     println(d)
     println(e)
     println(f)
     println(g1)
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


}
