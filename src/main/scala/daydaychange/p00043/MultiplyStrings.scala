package daydaychange.p00043

object MultiplyStrings {
  def multiply(num1: String, num2: String): String = {
    if (num1 == "0" || num2 == "0") return ""
    val v1 = num1.map(_.toString.toInt)
    val v2 = num2.map(_.toString.toInt)
    val result = scala.collection.mutable.ArraySeq((0 until num1.length + num2.length).map(_ => 0): _*)
    for (i <- v1.indices) {
      for (j <- v2.indices) {
        result(i + j + 1) = result(i + j + 1) + v1(i) * v2(j)
      }
    }
    for (i <- 1 until result.length) {
      result(result.length - i - 1) = result(result.length - i - 1) + result(result.length - i) / 10
      result(result.length - i) = result(result.length - i) % 10
    }
    val str = result.mkString("")
    str.substring(str.indexWhere(_ != '0'))
  }
}
