package daydaychange.p00003

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    val n = s.length
    var ans = 0
    val map = scala.collection.mutable.Map[Char, Int]()
    var i = 0
    for (j <- 0 until n) {
      if (map.contains(s(j))) {
        i = map(s(j)) max i
      }
      ans = ans max (j - i + 1)
      map.put(s(j), j + 1)
    }
    ans
  }
}
