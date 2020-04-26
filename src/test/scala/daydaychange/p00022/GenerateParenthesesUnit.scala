package daydaychange.p00022

import org.specs2.mutable.Specification

class GenerateParenthesesUnit extends Specification {
  "BruteForeUnit" should {
    GenerateParentheses.generateParenthesis(3) mustEqual List(
      "((()))",
      "(()())",
      "(())()",
      "()(())",
      "()()()"
    )
    "" mustEqual ""
  }
}
