package daydaychange.p0856

object Solution {
  def scoreOfParentheses(S: String): Int = {
    var ans = 0
    var bal = 0
    for (i <- 0 until S.length) {
      if (S(i) == '(') {
        bal = bal + 1
      } else {
        bal = bal - 1
        if (S(i - 1) == '(') {
          ans = ans + (1 << bal)
        }
      }
    }
    ans
  }
}
