package daydaychange.p00038

object CountandSay {
  private def countAndSay(s: String): String = {
    val result = new StringBuilder
    var last: Char = s.head
    var count = 0
    s.foreach(c => {
      if (last == c) {
        count += 1
      } else {
        result.append(count.toString)
        result.append(last)
        count = 1
        last = c
      }
    })
    result.append(count.toString)
    result.append(last)
    result.toString()
  }

  def countAndSay(n: Int): String = {
    if (n == 1) return "1"
    var s = "1"
    for (_ <- 0 until n - 1) {
      s = countAndSay(s)
    }
    s
  }
}
