package topics

object Unit052 {

  val wordList: List[String] = List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
  val aardvark: List[Char] = "aardvark".toList
  val numList: List[Int] = List(3, 1, 4, 1, 5, 9, 2, 6, 5)
  val bitList: List[Int] = List(1, 0, 1, 1, 0, 1, 1, 0)


  @main def exercise52aa(): Unit =
    val a = numList.foldLeft(0)(_ + _)
    val b = numList.foldLeft(2)(_ * _)
    val c = numList.foldLeft(1)(_ max _)
    val d = numList.foldLeft(1)(_ min _)
    val e = wordList.foldLeft("")(_ + _) // Here + is string concatenation
    val f = bitList.foldLeft(0)((n, b) => n + 1)
    val g = bitList.foldLeft(0)((p, b) => if (b == 1) 1 - p else p)
    val h = bitList.foldLeft((0, 0)) { case ((z, o), b) => (z + 1 - b, o + b) }
    val i = bitList.foldLeft(0)((d, b) => d * 2 + b)
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)


  /*
    * In many of the cases in exercise 52 you found that substituting foldLeft in
    * place of foldRight with the same initial value and same function (operator)
    * delivered the same results. In other cases, however, you had to adapt the
    * order of the parameters to the function (operator). This recognises that the
    * accumulating parameter is on right (or the left) of the function (operator)
    * respectively.
    *
    * You can use a foldLeft or a foldRight interchangeably, i.e.
    *
    *    xs.foldLeft(z)(op) == xs.foldRight(z)(op)
    *
    * under the following conditions:
    *
    * 		z op x == x                     // z is a left identity of op
    *  and
    *    x op z == x                     // z is a right identity of op
    *  and
    *    (a op b) op c == a op (b op c)  // op is an associative operator
    *
    * Mathematicians say that a tuple (z, op) that satisfies these properties
    * is a monoid.
    *
    * Thus, the following examples for z and op will permit interchangeability:
    * 	  (+, 0)  // numeric addition and zero			 0+x==x,  x+0==x,  (a+b)+c==a+(b+c)
    * 		(*, 1)	// numeric multiplication and one  1*x==x,  x*1==x,  (a*b)*c==a*(b*c)
    *    (+, "") // string concatenation and empty  ""+s==s, s+""==s, (s+t)+u==s+(t+u)
    *    (&&, true)  // conjunction and true      true&&b==b, b&&true==b,  && is associative
    *    (||, false) // disjunction and false    false||b==b, b||false==b, || is associative
    * and there are lots of other examples.
    * But,
    *    (-, 0) does not work because 0-x does not equal x, and - is not associative
    *           e.g.  5-0==5, 0-5==-5,  (3-4)-5==-6, 3-(4-5)==4
    *    (/, 1) does not work
    * and you can think of lots of other examples like this, too.
    */


}
