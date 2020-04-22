package daydaychange.p00013

import org.specs2.mutable.Specification

class RomanToIntegerUnit extends Specification {
  "LongestPalindrome" should {
    RomanToInteger.convert("V") mustEqual 5
    RomanToInteger.convert("III") mustEqual 3
    RomanToInteger.convert("IX") mustEqual 9
    RomanToInteger.convert("LVIII") mustEqual 58
    RomanToInteger.convert("MCMXCIV") mustEqual 1994
  }
}
