package daydaychange.p00022

import scala.collection.mutable.ListBuffer

object GenerateParentheses {
  def backtrack(ans: ListBuffer[String], cur: String, open: Int, close: Int, max: Int): Unit = {
    if (cur.length == max * 2) {
      ans.append(cur)
      return
    }
    if (open < max) backtrack(ans, cur + "(", open + 1, close, max)
    if (close < open) backtrack(ans, cur + ")", open, close + 1, max)
  }

  def generateParenthesis(n: Int): List[String] = {
    val ans = new ListBuffer[String]()
    backtrack(ans, "", 0, 0, n)
    ans.toList
  }
}
