package daydaychange.p00013

object RomanToInteger {
  private val labelMap = Map(
    'M' -> 1000,
    'D' -> 500,
    'C' -> 100,
    'L' -> 50,
    'X' -> 10,
    'V' -> 5,
    'I' -> 1
  )

  def convert(s: String): Int = {
    val lastSymbol = s(s.length - 1)
    var lastValue = labelMap(lastSymbol)
    var total = lastValue
    for (i <- s.length - 2 to(0, -1)) {
      val currentSymbol = s(i)
      val currentValue = labelMap(currentSymbol)
      if (currentValue < lastValue) {
        total = total - currentValue
      }
      else {
        total = total + currentValue
      }
      lastValue = currentValue
    }
    total
  }
}
