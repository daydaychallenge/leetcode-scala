package daydaychange.p00038

import org.specs2.mutable.Specification

class CountandSayUnit extends Specification {
  "CountandSayUnit" should {
    CountandSay.countAndSay(1) mustEqual "1"
    CountandSay.countAndSay(4) mustEqual "1211"
    CountandSay.countAndSay2(1) mustEqual "1"
    CountandSay.countAndSay2(4) mustEqual "1211"
  }
}
