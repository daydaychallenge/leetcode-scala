package daydaychange.p00632

object Solution {
  def smallestRange(nums: List[List[Int]]): Array[Int] = {
    var minx = 0
    var miny = Integer.MAX_VALUE
    val next = new Array[Int](nums.length)
    for (i <- nums.indices) {
      for (j <- nums(i).indices) {
        var min_i = 0
        var max_i = 0
        for (k <- nums.indices) {
          if (nums(min_i)(next(min_i)) > nums(k)(next(k))) min_i = k
          if (nums(max_i)(next(max_i)) < nums(k)(next(k))) max_i = k
        }
        if (miny - minx > nums(max_i)(next(max_i)) - nums(min_i)(next(min_i))) {
          miny = nums(max_i)(next(max_i))
          minx = nums(min_i)(next(min_i))
        }
        next(min_i) += 1
        if (next(min_i) == nums(min_i).length) {
          return Array[Int](minx, miny)
        }
      }
    }
    Array[Int](minx, miny)
  }
}
