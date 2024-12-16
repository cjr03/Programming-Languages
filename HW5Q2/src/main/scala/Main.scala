object Main extends App {
  private def sqr(n: Int): Int = n * n
  private def decrease(x: Int, j: Int): Int = x - j
  private def add(x: Int, j: Int): Int = x + j

  private def is_prime(x: Int, n: Int): Boolean = {
    def out_of_bounds(x: Int, n: Int) = { x <= 1 || sqr(n) > x }
    def divisible_by_n(x: Int, n: Int) = x % n == 0
    if (out_of_bounds(x, n)) { true }
    else if (divisible_by_n(x, n)) { false }
    else is_prime(x, n + 1)
  }

  private def add_fth (x: Int, f: (Int, Int)=>Int, j: Int) : Int = {
    if(x <= 0){ 0 }
    else x + add_fth(f(x, j), f, j)
  }
  private def apply_combine(g: (Int, Int)=>Int, f: Int=>Int, x: Int): Int = {
    if(x == 0) 0
    else g(apply_combine(g, f, x-1), f(x))
  }

  private def Main(): Unit = {
    println(is_prime(7, 2))
    println(is_prime(12, 2))
    val out: Int = add_fth(10, decrease, 2)
    println(out)
    println(apply_combine(decrease, sqr, 4))
    println(apply_combine(add, sqr, 4))
  }

  Main()

}
