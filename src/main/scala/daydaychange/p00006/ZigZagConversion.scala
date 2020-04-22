package daydaychange.p00006

object ZigZagConversion {
  def convert(s: String, numRows: Int): String = {
    if (s == null || s.length <= 1) return s
    if (numRows <= 1) return s
    val result = new StringBuilder
    val z = 2 * numRows - 2
    for (i <- 0 until numRows) {
      for (j <- 0 until(s.length - i, z)) {
        result.append(s(i + j))
        if (i != 0 && i != (numRows - 1) && (j + z - 1) < s.length) {
          result.append(s(j + z - i))
        }
      }
    }
    result.toString()
  }
}
