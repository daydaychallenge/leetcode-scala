package daydaychange.p0856

import org.specs2.mutable.Specification

class DivideAndConquerUnit extends Specification {
  "Divide and Conquer" should {
    Solution.scoreOfParentheses("()") mustEqual 1
    Solution.scoreOfParentheses("(())") mustEqual 2
    Solution.scoreOfParentheses("()()") mustEqual 2
    Solution.scoreOfParentheses("(()(()))") mustEqual 6
  }
}
