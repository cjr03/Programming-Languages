abstract class BSTree {
  def member(x: Int): Boolean // Tells us if x is in the BSTree
  def insert(x: Int): BSTree // Creates a new tree that is the same as this one, but with x added
  def equals(that: Any): Boolean // Fixed method signature
  def depth: Int
  def max: Int
  def exactsubtree(that: Any): Boolean
  def toString: String // Added to make the class compilable
}

case class Node(value: Int, left: BSTree, right: BSTree) extends BSTree {
  override def equals(that: Any): Boolean = that match { // Fixed method implementation
    case Leaf => false
    case Node(v, l, r) => (value == v) && (left == l) && (right == r) // Fixed equals comparison
  }

  def member(x: Int): Boolean = { // Fixed method implementation
    if (x == value) true
    else if (x < value) left.member(x) // look in left subtree
    else right.member(x) // look in right subtree
  }

  def insert(x: Int): BSTree = { // Fixed method implementation
    if (x == value) this
    else if (x < value) Node(value, left.insert(x), right)
    else Node(value, left, right.insert(x))
  }

  override def toString: String = "{" + left.toString + value.toString + right.toString + "}"

  def depth: Int = 1 + math.max(left.depth, right.depth)

  def max: Int = right match {
    case Leaf => value
    case _ => right.max
  }

  def exactsubtree(that: Any): Boolean = that match {
    case Leaf => false
    case Node(v, l, r) => this.equals(that) || left.exactsubtree(that) || right.exactsubtree(that)
  }
}


case object Leaf extends BSTree {
  def member(x: Int): Boolean = false

  def insert(x: Int): BSTree = Node(x, Leaf, Leaf)

  override def toString: String = "." // Fixed toString implementation

  def depth: Int = 0

  def max: Int = -1

  def exactsubtree(that: Any): Boolean = that == Leaf
}

object Main extends App{

}
