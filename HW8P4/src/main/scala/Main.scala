object Main extends App{
  def setlist(list: List[Int]): Int => Boolean = {
    (x: Int) => list.contains(x)
  }

  def filter(s: Int => Boolean, p: Int => Boolean): Int => Boolean = {
    (x: Int) => s(x) && p(x)
  }

  def forall(s: Int => Boolean, p: Int => Boolean): Boolean = {
    def trueinrange(start: Int): Boolean = {
      if (start > 1000) true
      else if (!s(start) || !p(start)) false
      else trueinrange(start + 1)
    }
    trueinrange(-1000)
  }
}
