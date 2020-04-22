package daydaychange.p00006

import org.specs2.mutable.Specification

class ZigZagConversionUnit extends Specification {
  "ZigZagConversion" should {
    ZigZagConversion.convert("LEETCODEISHIRING", 3) mustEqual "LCIRETOESIIGEDHN"

    ZigZagConversion.convert("LEETCODEISHIRING", 4) mustEqual "LDREOEIIECIHNTSG"
  }
}
