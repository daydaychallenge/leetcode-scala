package daydaychange.p00266

import org.specs2.mutable.Specification

class PalindromePermutationUnit extends Specification {
  "PalindromePermutationUnit" should {
    PalindromePermutation.test("code") mustEqual false
    PalindromePermutation.test("aab") mustEqual true
    PalindromePermutation.test("carerac") mustEqual true

    PalindromePermutation.test2("code") mustEqual false
    PalindromePermutation.test2("aab") mustEqual true
    PalindromePermutation.test2("carerac") mustEqual true
  }
}
