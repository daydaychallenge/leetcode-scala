package daydaychange.p00005

object LongestPalindrome {


  def bruteForce(s: String): String = {
    if (s == null || s.length <= 1) return s

    def isPalindrome(start: Int, end: Int): Boolean = {
      val mid = start + (end - start) / 2
      for (i <- start to mid) {
        if (s.charAt(i) != s.charAt(end - i + start))
          return false
      }
      true
    }

    var maxLen = 1
    var startIndex = 0

    for (i <- 1 until s.length) {
      for (j <- 0 until i) {
        if (s.charAt(i) == s.charAt(j)
          && isPalindrome(j, i)
        ) {
          if (i - j + 1 > maxLen) {
            maxLen = i - j + 1
            startIndex = j
          }
        }
      }
    }
    s.substring(startIndex, startIndex + maxLen)
  }

  def manacher(s: String): String = {
    val s_new = s.toCharArray.mkString("#", "#", "#")
    val range = for (_ <- 0 until s_new.length) yield {
      1
    }
    val Len = scala.collection.mutable.ArrayBuffer[Int](range: _*)
    var sub_midd = 0
    var sub_side = 0
    for (i <- 1 until s_new.length) {
      if (i < sub_side) {
        val j = 2 * sub_midd - i
        if (j >= 2 * sub_midd - sub_side
          && (sub_side - i) >= Len(j)) {
          Len(i) = Len(j)
        } else {
          Len(i) = sub_side - i + 1
        }
      }
      while ((i - Len(i) >= 0 && i + Len(i) < s_new.length) && (s_new(i - Len(i)) == s_new(i + Len(i)))) {
        Len(i) = Len(i) + 1
        if (Len(i) >= Len(sub_midd)) {
          sub_side = Len(i) + i - 1
          sub_midd = i
        }
      }
    }
    s.substring((2 * sub_midd - sub_side) / 2, sub_side / 2)
  }


}
