package daydaychange.p00443

import org.specs2.mutable.Specification

class StringCompressionUnit extends Specification {
  "StringCompressionUnit" should {
    StringCompression.compress(Array('a','a','b','b','c','c','c')) mustEqual 6
    StringCompression.compress(Array('a')) mustEqual 1
    StringCompression.compress(Array('a','b','b','b','b','b','b','b','b','b','b','b','b')) mustEqual 4
  }
}
