package daydaychange.p00020

object ValidParentheses {
  def isValid(s: String): Boolean = {
    var stack = List[Int]()
    val right = Seq(')', ']', '}')
    s.foreach({
      case '(' =>
        stack = ')' :: stack
      case '[' =>
        stack = ']' :: stack
      case '{' =>
        stack = '}' :: stack
      case char: Char if right.contains(char) =>
        if (stack.isEmpty || stack.head != char) {
          return false
        } else {
          stack = stack.tail
        }
    })
    stack.isEmpty
  }

  def isValid2(s: String): Boolean = {
    val terminals = Array("()", "[]", "{}")
    s.foldLeft(List[Char]()){(a,v) => a match {
      case x :: xs if (terminals.contains("" + x + v)) => xs
      case _ => v +: a
    }}.isEmpty
  }
}
