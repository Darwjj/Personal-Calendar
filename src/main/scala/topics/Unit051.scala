package topics

object Unit051 {
  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val aardvark: List[Char] = "aardvark".toList
  val numList: List[Int] = List(3, 1, 4, 1, 5, 9, 2, 6, 5)
  val bitList: List[Int] = List(1, 0, 1, 1, 0, 1, 1, 0)


  /*
   * Exercise 51
   * Using only foldRight compute each of the following:
   * (a) the sum of the numbers in numList. Should be 36
   * (b) the product of the numbers in numList. Should be 32400
   * (c) the largest number in numlist. Should be 9
   * (d) The smallest number in numlist. Should be 1
   * (e) All the words in wordList flattened into a string: "Thequickbrownfoxjumpedoverthelazydog"
   * (f) The length of bitList. Should be 8
   * (g) The parity (number of 1 bits) of bitList (0 if even, 1 if odd). Should be 1
   * (h) The number of zeros and ones in bitList returned as a pair of Int values. Should be (3, 5)
   * (i) The longest word in wordList. Should be "jumped"
   * (j) The list of words from wordList with each word reversed
   * (k) The list of words from wordList containing the letter 'o'
   */

  @main def exercise51aa(): Unit =
    lazy val a = numList.sum
    lazy val b = numList.product
    lazy val c = numList.max
    lazy val d = numList.min
    lazy val e = wordList.flatten.foldLeft("")(_:+_)
    lazy val f = bitList.length
    lazy val g = bitList.count(_==1)%2
    lazy val h = (bitList.count(_==0),bitList.count(_==1))
    lazy val i = wordList.reduceLeft((a,b) => if (a.length > b.length) a else b)
    lazy val j = wordList.reverse
    lazy val k = wordList.map(_.contains("o"))
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
    println(k)


}
