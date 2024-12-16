
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
      else isTrueInRange(start + 1)
    }
    trueinrange(-1000)
  }
}


class Rational(x:Int, y:Int){//This is both the class definition and the definition of the primary constructor
  //def get_x() = x
  private val g = gcd(x, y)
  val numer = x/g//no need to write a function when the value can never change
  val denom = y/g

  def this() = this(0, 1)//The RHS is just a call to the primary constructor
  def this(x:Int) = this(x, 1)

  def *(that:Rational):Rational = new Rational(that.numer*this.numer, that.denom*this.denom)
  //Define addition
  def +(that:Rational):Rational = new Rational(that.numer*this.denom+this.numer*that.denom, that.denom*this.denom)
  def unary_- = new Rational(-this.numer, this.denom)
  def -(that:Rational):Rational = this + -that//Use our operators to do this
  def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b, a%b)//Where to call this?
}
