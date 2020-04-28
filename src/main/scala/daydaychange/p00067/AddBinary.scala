package daydaychange.p00067

object AddBinary {
  def addBinary(a: String, b: String): String = {
    var v = 0
    val str = (for (i <- 0 until Seq(a.length, b.length).max) yield {
      v = v + (if (i < a.length && a(a.length - i - 1) == '1') 1 else 0) + (if (i < b.length && b(b.length - i - 1) == '1') 1 else 0)
      val str = if (v % 2 == 1) "1" else "0"
      v = v / 2
      str
    }).mkString("").reverse
    if (v == 1) {
      "1" + str
    } else {
      str
    }
  }
}
