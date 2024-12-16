object Main extends App {
  def problem1(xs: List[Int], ys: List[Int]): List[Int] = {
    (xs, ys) match {
      case (Nil, Nil) => Nil
      case (head1 :: tail1, Nil) => head1 :: problem1(xs.tail, ys)
      case (Nil, head2 :: tail2) => head2 :: problem1(xs, ys.tail)
      case (head1 :: tail1, head2 :: tail2) => head1 :: head2 :: problem1(xs.tail, ys.tail)
    }
  }

  private def add(x: Int, y: Int): Int = x+y

  private def problem2[A <: AnyRef](f:(A, A)=>A, ls: List[A], neutral: A): A = {
    if(ls.isEmpty) neutral
    else f(ls.head, problem2(f, ls.tail, neutral))
  }

  val xs: List[Int] = 4 :: 3 :: 2 :: 1 :: Nil
  val ys: List[Int] = 3 :: 2 :: 1 :: Nil

  def Main(): Unit = {
    println("Problem 1 takes in 4::3::2::1::Nil and 3::2::1::Nil and yields " + problem1(xs, ys))
  }

  Main()
}
