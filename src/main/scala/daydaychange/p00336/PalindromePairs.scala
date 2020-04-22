package daydaychange.p00336

object PalindromePairs {
  def find(values: String*): Seq[(Int, Int)] = {
    for (i <- 0 until values.length; j <- 0 until values.length if i != j && test(values(i),values(j))) yield {
      i -> j
    }
  }

  private def test(val1: String, val2: String): Boolean = {
    val s = val1 + val2
    for (i <- 0 until s.length / 2) {
      if (s(i) != s(s.length - i - 1)) {
        return false
      }
    }
    true
  }
}
