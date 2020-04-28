package daydaychange.p00371

object SumofTwoIntegers {
  def getSum(a: Int, b: Int): Int = {
    if (b == 0) return a
    val sum = a ^ b
    val carry = (a & b & 0x7fffffff) << 1
    getSum(sum, carry)
  }
}
