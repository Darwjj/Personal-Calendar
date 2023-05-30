package topics

object Unit043 {
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

  @main def exercise44aa(): Unit =
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


}
