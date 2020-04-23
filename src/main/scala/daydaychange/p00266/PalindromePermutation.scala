package daydaychange.p00266

object PalindromePermutation {
  def test(str: String): Boolean = {
    val map = scala.collection.mutable.Map[Char, Int]()
    str.toCharArray.foreach(f => {
      map(f) = map.getOrElse(f, 0) + 1
    })
    var flag = (str.length + 1) % 2
    map.foreach(item => {
      if (item._2 % 2 != 0) {
        flag = flag + 1
      }
      if (flag >= 2) {
        return false
      }
    })
    true
  }

  def test2(str: String): Boolean = {
    str.toCharArray.groupBy(_ -> 1).count(_._2.length % 2 != 0) + (str.length+1)%2 <2
  }
}
