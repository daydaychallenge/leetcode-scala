package daydaychange.p00005

import org.specs2.mutable.Specification

class LongestPalindromeUnit extends Specification {
  "LongestPalindrome" should {
    LongestPalindrome.bruteForce("babaddabad") mustEqual "abaddaba"
    LongestPalindrome.manacher("babaddabad") mustEqual "abaddaba"
  }
}
