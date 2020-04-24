package daydaychange.p00043

import org.specs2.mutable.Specification

class MultiplyStringsUnit extends Specification {
  "MultiplyStringsUnit" should {
    MultiplyStrings.multiply("0", "0") mustEqual "0"
    MultiplyStrings.multiply("2", "3") mustEqual "6"
    MultiplyStrings.multiply("12", "13") mustEqual "156"
    MultiplyStrings.multiply("123", "456") mustEqual "56088"
  }
}
