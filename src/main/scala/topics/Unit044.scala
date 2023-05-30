package topics
import java.io.File

object Unit044 {
  /*
   * Exercise 45
   *
   * The code in the following example gets the filenames of the
   * Scala programs in the topics folder. The variable CODE_PATH
   * holds the relative pathname of the topics folder.
   */
  @main def exercise45aa(): Unit = {

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


}
