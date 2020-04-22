package daydaychange.p00336

import org.specs2.mutable.Specification

class PalindromePairsUnit extends Specification {
  "LongestPalindrome" should {
    PalindromePairs.find("abcd", "dcba", "lls", "s", "sssll") mustEqual Seq(0 -> 1, 1 -> 0, 2 -> 4, 3 -> 2)
    PalindromePairs.find("bat", "tab", "cat") mustEqual Seq(0 -> 1, 1 -> 0)
    "" mustEqual ""
  }
}
