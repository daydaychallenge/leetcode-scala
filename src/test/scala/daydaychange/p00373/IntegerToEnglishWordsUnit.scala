package daydaychange.p00373

import org.specs2.mutable.Specification

class IntegerToEnglishWordsUnit extends Specification {
  "PlusOneLinkedListUnit" should {
    IntegerToEnglishWords.numberToWords(123) mustEqual "One Hundred Twenty Three"
    IntegerToEnglishWords.numberToWords(12345) mustEqual "Twelve Thousand Three Hundred Forty Five"
    IntegerToEnglishWords.numberToWords(1234567) mustEqual "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
    IntegerToEnglishWords.numberToWords(1234567891) mustEqual "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
  }
}
