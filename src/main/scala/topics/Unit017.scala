package topics

object Unit017 {

  def sub(x: Int)(y: Int): Int = x - y
  def div(x: Int)(y: Int): Int = x / y
  val twice: (Int => Int) => (Int => Int) = f => x => f(f(x))

  /* Exercise 18 code */

  val flip: (Int => Int => Int) => (Int => Int => Int) = f => a => b => f(b)(a)

  val subtract10: Int => Int = flip(sub)(10)

  val ex18i: Int = flip(div)(7)(flip(sub)(37)(100))

  val ex18ii: Int = (flip(sub)(2) compose flip(div)(10)) (200)

  val ex18iii: Int = flip(flip(sub))(32)(17)

  val ex18iv: Int = (flip compose flip) (sub)(99)(44)

  val ex18v: Int = twice(flip(div)(10))(500)



  @main def exercise18(): Unit =
    println(subtract10)
    println(ex18i)
    println(ex18ii)
    println(ex18iii)
    println(ex18iv)
    println(ex18v)
}
