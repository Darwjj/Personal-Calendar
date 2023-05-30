package topics

import lib.picture
import lib.picture.Picture
import lib.picture.Picture.*

object Unit061 {


  /*
   * Exercise 61
   */
  @main def exercise61a(): Unit =
    val matrix = Picture("01234\n56789")
    val answer = Picture("30  80\n80 255")
    val times = Picture(" \n*").borderLR()
    val equals = Picture(" \n=").borderLR()
    println(matrix)
    println(matrix.frameBNC)
    println(matrix)
    println(matrix.frameBNC)
    println(matrix.reflectH.frameBNC)
    println(matrix.reflectV.frameBNC)
    println(matrix.transpose.frameBNC)
    println(matrix.frameBNC ^ times ^ matrix.transpose.frameBNC ^ equals ^ answer.frameBNC)




  /*
   * Exercise 62
   */
  @main def exercise62a(): Unit =
    val triangles: Seq[Picture] = (1 to 8).map(box(_, 1, '*')).scanLeft(empty)(_ + (_, BOT))
    val ascending = triangles.spread(BOT)
    val descending = triangles.spread(TOP)
    println(ascending)
    println()
    println(descending)
    println(ascending + ascending.rotate(2).reflectH)
    println(descending ^ descending.reflectH)
    println((descending ^ descending.reflectH) + (descending ^ descending.reflectH).rotate(2))
    println((ascending ^ ascending.reflectH) + (ascending ^ ascending.reflectH).rotate(2))




  /*
   * Exercise 63
   */

  @main def exercise63a(): Unit =
    val words =
      """The flow method
        |creates a picture by flowing text from a string into a rectangle of
        |given width. The words are identified by removing any whitespace
        |characters from around them. No word is split unless it is longer
        |than the specified width. The depth of the picture is no more than
        |necessary to flow all of the words into the area.
        |""".stripMargin
    val para = flow(width = 40, words)
    println(para.frameBNC)
    println((para + para.map(_.toUpper)).frameBNC)
    println((para.frameR + para.map(_.toUpper)).frameNC)




  /*
   * Exercise 64
   */

  case class InfRule(premises: Seq[String], conclusion: String, name: String = "") {
    override def toString: String = this.toPicture.toString

    def toPicture: Picture = {
      val lines = premises.mkString(", ") + "\n" + ("-" * 22) + s" [$name]\n" + " " * 16 + conclusion
      Picture(lines)
    }
  }

  @main def exercise64a(): Unit =
    val modusPonens = InfRule(Seq("A", "A -> B"), "B", "Modus ponens")
    val orElim = InfRule(Seq("A -> C", "B -> C", "A \\/ B"), "C", "Or elimination")
    val reductio = InfRule(Seq("A |- B", "A |- ~B"), "~A", "Reductio ad absurdum")
    val deduction = InfRule(Seq("A |- B"), "A -> B", "Deduction")
    println(modusPonens)
    println(orElim)
    println(reductio)
    println(deduction)


  /*
   * Exercise 65
   */
  val text =
    """
      |Functional programming (FP) has been practised since the 1950s. However, in recent
      |years the paradigm has gained increasing prominence in industry, driven mainly by
      |changes in computer architecture. The FP style moves away from more traditional
      |approaches to algorithm design which includes mutable state and sequential updates
      |towards a style that encourages immutability and higher-order functions.
      |
      |FP can be quite challenging initially to programmers with a traditional background
      |because its underlying principles are very different from those they have practised
      |for many years. However, once the benefits have been realised and understood there
      |are significant advantages to be gained from using FP when appropriate.
      |
      |Although there are the “purer” FP languages such as Haskell, the majority of FP in
      |industry is embedded within mainstream OO languages such as C++, Python, PHP, C#
      |and Java. In this module we will look at programming in a functional style using
      |Scala.
      |
      |Scala is a large language and we cannot cover all of its features in this module.
      |You are encouraged to read around if you are interested to discover many more
      |techniques and ideas.
      |
      |We will be focusing on curried functions, higher order
      |functions, function composition, partial application, immutable data structures
      |(especially lists), lazy lists, domain specific languages, and some applications.
      |
      |Each week we cover a unit which will focus on a particular topic. The lectures
      |for the unit are delivered in week n, and the exercises for that unit are
      |to be undertaken by the end of week (n+1). Solutions to the exercises will be
      |published at 12:00 on the Friday of week (n+2).
      |""".stripMargin

  def toParagraphs(xs: String): Vector[String] =
    val blocks: Vector[String] = xs.split(System.lineSeparator() * 2).toVector
    for
      block <- blocks
      cleanBlock = block.dropWhile(System.lineSeparator() contains _)
        .map(ch => if System.lineSeparator() contains ch then ' ' else ch)
      if cleanBlock.nonEmpty
    yield
      cleanBlock



  @main def exercise65a(): Unit =
    val introTitle = "Introduction to Functional Programming"map(Picture(_).borderLR())
    val paras: Vector[Picture] = toParagraphs(text) map (flow(40, _).borderLR())
    println(paras++introTitle)


  // Construct a new picture and print it out. This time, the information should be
    // displayed as a two-column article with the paragraphs numbered, and with a header.
  /*
   * Exercise 66
   */
  @main def exercise66a(): Unit =
      val numkeys: Vector[Picture] = Vector(7, 8, 9, 4, 5, 6, 1, 2, 3) map (k => Picture(k.toString).borderLR().frameNC)
      val keypad1 = numkeys.grouped(3).toVector.map(_.spread()).stack()

      val opkeys: Vector[Picture] = Vector("  0   ", ".", " ") map (Picture(_).borderLR().frameNC)
      val sidekeys: Vector[Picture] = Vector("-", "+", "E") map(Picture(_).borderLR().frameNC)
      val numkeys2: Vector[Picture] = Vector("N", "/", "*", "-", "7", "8", "9", "+", "4", "5", "6", "", "1", "2", "3", "E") map (k => Picture(k.toString).borderLR().frameNC)
      val keypad2 = (numkeys2 ++ opkeys).grouped(4).toVector.map(_.spread()).stack()
      // val keypad2 = numkeys2.grouped(4).toVector.map(_.spread()).stack()+sidekeys.stack(LFT)+opkeys.spread(BOT)

      //println(keypad1)
      println(keypad2)
}