package daydaychange.p00371

import org.specs2.mutable.Specification


class SumofTwoIntegersUnit extends Specification {
  "PlusOneLinkedListUnit" should {
    SumofTwoIntegers.getSum(1, 2) mustEqual 3
    SumofTwoIntegers.getSum(-2, 3) mustEqual 1
  }
}
