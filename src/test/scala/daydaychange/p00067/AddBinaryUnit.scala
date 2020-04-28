package daydaychange.p00067

import org.specs2.mutable.Specification

class AddBinaryUnit extends Specification {
  "AddBinaryUnit" should {
    AddBinary.addBinary("11","1") mustEqual "100"
    AddBinary.addBinary("1010","1011") mustEqual "10101"
  }
}
