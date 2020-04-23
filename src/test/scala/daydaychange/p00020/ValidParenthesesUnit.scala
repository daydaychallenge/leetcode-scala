package daydaychange.p00020

import org.specs2.mutable.Specification

class ValidParenthesesUnit extends Specification {
  "PalindromePermutationUnit" should {
//    ValidParentheses.isValid("()") mustEqual true
//    ValidParentheses.isValid("()[]{}") mustEqual true
    ValidParentheses.isValid("([)]") mustEqual false
    ValidParentheses.isValid("{[]}") mustEqual true

  }
}
