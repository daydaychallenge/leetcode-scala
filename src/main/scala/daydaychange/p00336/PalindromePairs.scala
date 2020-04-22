package daydaychange.p00336

object PalindromePairs {
  var index = 0

  private def isPalindrome(word: String): Boolean = {
    index = index + 1
    for (i <- 0 until word.length / 2) {
      if (word(i) != word(word.length - i - 1)) {
        return false
      }
    }
    true
  }

  def find1(words: String*): Seq[(Int, Int)] = {
    index = 0
    val result = for (i <- 0 until words.length; j <- 0 until words.length if i != j && isPalindrome(words(i) + words(j))) yield {
      i -> j
    }
    println(s"find1 ${words.length} ${index}")
    result
  }

  private def isPalindromeBetween(word: String, front: Int, back: Int): Boolean = {
    index = index + 1
    for (i <- 0 until (back - front)) {
      if (word(front + i) != word(back - i)) {
        return false
      }
    }
    true
  }

  def allValidPrefixes(word: String): Seq[String] = {
    for (i <- 0 until word.length if isPalindromeBetween(word, i, word.length() - 1)) yield {
      word.substring(0, i)
    }
  }

  def allValidSuffixes(word: String): Seq[String] = {
    for (i <- 0 until word.length if isPalindromeBetween(word, 0, i)) yield {
      word.substring(i + 1, word.length)
    }
  }

  def find2(words: String*): Seq[(Int, Int)] = {
    index = 0
    var result: Seq[(Int, Int)] = Seq()
    val wordSet = Map((for (i <- 0 until words.length) yield {
      words(i) -> i
    }): _*)

    words.foreach(word => {
      val currentWordIndex = wordSet(word)
      val reversedWord = new StringBuilder(word).reverse.toString
      if (wordSet.contains(reversedWord) && (wordSet(reversedWord) != currentWordIndex)) {
        result = result :+ (currentWordIndex -> wordSet(reversedWord))
      }
      allValidSuffixes(word).foreach(suffix => {
        val reversedSuffix = new StringBuilder(suffix).reverse.toString
        if (wordSet.contains(reversedSuffix)) {
          result = result :+ (wordSet(reversedSuffix) -> currentWordIndex)
        }
      })
      allValidPrefixes(word).foreach(suffix => {
        val reversedSuffix = new StringBuilder(suffix).reverse.toString
        if (wordSet.contains(reversedSuffix)) {
          result = result :+ (currentWordIndex -> wordSet(reversedSuffix))
        }
      })
    })
    println(s"find2 ${words.length} ${index}")
    result
  }

}
