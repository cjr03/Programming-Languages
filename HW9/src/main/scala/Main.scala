object Main extends App {
  def square(x: Int) = x*x
  def cube(x: Int) = x*x*x
  def cond(b: Boolean) = {
    def pick(x: Int, y: Int=>Int, z:Int=>Int): Int = {
      if(b){
        y(x)
      } else {
        z(x)
      }
    }
    pick(4, square, cube)
  }
  def Main(): Unit = {
    print(cond(3<5))
  }
  Main()
  class Set(f:Int=>Boolean){
    //the function f returns true for elements of the set and false for all other numbers
    def contains(elem: Int): Boolean = f(elem)
    //returns true if elem is in the set and false for all other numbers
    def \/ (t:Set):Set = new Set(x => this.contains(x) or t.contains(x))
    //Returns the union of this set and t.
    def /\ (t:Set):Set = new Set(x => this.contains and t.contains(x))
    //Returns the intersection of this set and t
    def - (t:Set):Set = new Set(x => this.contains(x) and !t.contains(x))
    //Returns the difference of this set and t
    def filter(p:Int=>Boolean):Set = new Set(x => this.contains(x) and p(x))
    // Returns a new set that consists of the elements of s that satisfy the predicate.
    def forall(p:Int=>Boolean): Boolean = {
      x = -1000
      def check(x: Int): Boolean = {
        if(x == 1000) True
        if(p(x) != contains(x)){
          False
        } else check(x+1)
      }
      check(x)
    }
    //Returns true if the predicate is true for all elements of this set, and false otherwise.
    // In order to make it possible to implement this function, we will consider a predicate true for all integers if it is true for integers from -1000 to 1000.
  }
}
