import scala.collection.immutable.List

object Main extends App {
  private def add(x:Int, y:Int): Int = x+y
  private def squareadd(x:Int, y:Int) = x*x + y
  private def reduce(f:(Int, Int)=>Int, ls: List[Int]): Int = {
    if(ls.isEmpty) 0
    else f(ls.head, reduce(f, ls.tail))
  }
  private def reduce_curry(f:(Int, Int)=> Int): List[Int] => Int = {
    (xs: List[Int]) => {
      if(xs.isEmpty) 0
      else f(xs.head, reduce_curry(f)(xs.tail))
    }
  }
  val xs = 5 :: 4 :: 3 :: 2 :: 1 :: Nil
  val ys = 4 :: 3 :: 2 :: 1 :: Nil
  private def problem2(f:(Int, Int)=>Int, xs: List[Int], ys: List[Int]): List[Int] = {
    if(xs.isEmpty || ys.isEmpty) Nil
    else f(xs.head, ys.head)::problem2(f, xs.tail, ys.tail)
  }
  private def problem2_curry(f:(Int, Int)=>Int): (List[Int],List[Int]) => List[Int] = {
    (xs: List[Int], ys: List[Int]) => {
      if(xs.isEmpty || ys.isEmpty) Nil
      else f(xs.head, ys.head)::problem2_curry(f)(xs.tail, ys.tail)
    }
  }

  private def problem4_curry(f:(Int, Int)=>Int): List[Int]=>List[Int]=>List[Int] = {
    (xs: List[Int]) => {
      (ys: List[Int]) => {
        if(xs.isEmpty || ys.isEmpty) Nil
        else f(xs.head, ys.head)::problem4_curry(f)(xs.tail)(ys.tail)
      }
    }
  }

  private def greater(x: Int, y: Int) = x>y

  private def replace_if(decide: (Int, Int)=>Boolean): (List[Int], Int) => List[Int] = {
    (xs: List[Int], value: Int) => {
      if (xs.isEmpty) Nil
      else if (decide(xs.head, value)) value::replace_if(decide)(xs.tail, value)
      else xs.head::replace_if(decide)(xs.tail, value)
    }
  }

  private def Main(): Unit = {
    printf("Problem 1 takes in the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil and yields %d\n", reduce(add, xs))
    println("Problem 2 takes in add, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem2(add, xs, ys))
    println("Problem 2 takes in squareadd, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem2(squareadd, xs, ys))
    printf("Problem 3 takes in the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil and yields %d\n", reduce_curry(add)(xs))
    println("Problem 4 takes in add, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem2_curry(add)(xs, ys))
    println("Problem 4 takes in squareadd, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem2_curry(squareadd)(xs, ys))
    println("Problem 5 takes in add, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem4_curry(add)(xs)(ys))
    println("Problem 5 takes in squareadd, the list 5 :: 4 :: 3 :: 2 :: 1 :: Nil the list 4 :: 3 :: 2 :: 1 :: Nil and yields " + problem4_curry(squareadd)(xs)(ys))
    println(replace_if(greater)(xs, 3))
  }


  Main()
}

class Vector(_i: Int, _j: Int) {
  private val i: Int = _i
  private val j: Int = _j
  def this() = Vector(0, 0)
  def +(that: Vector): Vector = new Vector(i+that.i, j+that.j)
}