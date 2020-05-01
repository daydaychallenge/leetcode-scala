package daydaychange.p00003

import org.specs2.mutable.Specification

class SolutionUnit extends Specification {
  "SolutionUnit" should {
    Solution.lengthOfLongestSubstring("abcabcbb") mustEqual 3
    Solution.lengthOfLongestSubstring("bbbbb") mustEqual 1
    Solution.lengthOfLongestSubstring("pwwkew") mustEqual 3
  }
}
