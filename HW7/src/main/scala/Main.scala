class Biguint(num: List[Int]) {
  val nums: List[Int] = num
  def this(s:String) = this({def convert(s:String):List[Int] = {if(s.isEmpty) Nil else convert(s.tail):::List(s.head-'0')}; convert(s)})
  def this() = this(0::Nil)
  private def plus(a: Biguint, b: Biguint): Int => List[Int] = {
    (c: Int) => {
      if (a.nums.isEmpty && b.nums.isEmpty) {
        Nil
      } else if (a.nums.isEmpty) {
        (b.nums.head + c % 10) :: plus(a, new Biguint(b.nums.tail))(b.nums.head + c / 10)
      } else if (b.nums.isEmpty) {
        (a.nums.head + c % 10) :: plus(new Biguint(a.nums.tail), b)(a.nums.head + c / 10)
      } else {
        ((b.nums.head + a.nums.head + c) % 10) :: plus(new Biguint(a.nums.tail), new Biguint(b.nums.tail))((b.nums.head + nums.head + c) / 10)
      }
    }
  }
  def +(b: Biguint): Biguint = {
    val numbers: List[Int] = plus(this, b)(0)
    new Biguint(numbers)
  }
}

object Main extends App{
  private def add(x:Int, y:Int): Int = x+y
  private def squareadd(x:Int, y:Int) = x*x + y
  val xs = 5 :: 4 :: 3 :: 2 :: 1 :: Nil
  val ys = 4 :: 3 :: 2 :: 1 :: Nil
  private def problem3(f:(Int, Int)=> Int): List[Int] => Int = {
    (xs: List[Int]) => {
      if(xs.isEmpty) 0
      else f(xs.head, problem3(f)(xs.tail))
    }
  }

  private def problem5(f:(Int, Int)=>Int): List[Int]=>List[Int]=>List[Int] = {
    (xs: List[Int]) => {
      (ys: List[Int]) => {
        if(xs.isEmpty || ys.isEmpty) Nil
        else f(xs.head, ys.head)::problem5(f)(xs.tail)(ys.tail)
      }
    }
  }
  def findlast(xs:List[Int], x:Int):Int = {
    if(xs.isEmpty) -1
    else if (xs.head == x) 0
    else 1 + findlast(xs.tail, x)
  }

  private def Main(): Unit = {
    println("Problem 3 HW6 takes in the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem3(add)(xs))
    println("Problem 5 HW6 takes in squareadd, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem5(squareadd)(xs)(ys))
    printf("Problem 2 takes in the Biguint 12345 and 1234 and returns 13579 inside a Biguint with nums stored as " + (new Biguint(5::4::3::2::1::Nil) + new Biguint(4::3::2::1::Nil)).nums + "\n")
    printf("Problem 3 yields that the last 2 in the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil is at index " + findlast(xs, 2))
  }
  Main()
}

