package daydaychange.p00336

import org.specs2.mutable.Specification

class PalindromePairsUnit extends Specification {
  "LongestPalindrome" should {
    //    PalindromePairs.find1("abcd", "dcba", "lls", "s", "sssllaaasdfasqwvcasdrqwtbsdfwertqczzdfqw4rtyrnx")
    //    PalindromePairs.find2("abcd", "dcba", "lls", "s", "sssllaaasdfasqwvcasdrqwtbsdfwertqczzdfqw4rtyrnx")

    PalindromePairs.find1("abcd", "dcba", "lls", "s", "sssll",
      "1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "00000",
      "AAAA", "BBBB",
    ) mustEqual Seq(0 -> 1, 1 -> 0, 2 -> 4, 3 -> 2)
    PalindromePairs.find2("abcd", "dcba", "lls", "s", "sssll",
      "1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "00000",
      "AAAA", "BBBB") mustEqual Seq(0 -> 1, 1 -> 0, 3 -> 2, 2 -> 4)

    PalindromePairs.find1("abcd", "dcba", "lls", "s", "sssll") mustEqual Seq(0 -> 1, 1 -> 0, 2 -> 4, 3 -> 2)
    PalindromePairs.find2("abcd", "dcba", "lls", "s", "sssll") mustEqual Seq(0 -> 1, 1 -> 0, 3 -> 2, 2 -> 4)
    PalindromePairs.find1("bat", "tab", "cat") mustEqual Seq(0 -> 1, 1 -> 0)
    PalindromePairs.find2("bat", "tab", "cat") mustEqual Seq(0 -> 1, 1 -> 0)
  }
}
