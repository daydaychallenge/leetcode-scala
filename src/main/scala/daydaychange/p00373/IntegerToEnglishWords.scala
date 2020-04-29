package daydaychange.p00373

object IntegerToEnglishWords {
  private val one = Seq("", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
  private val twoLessThan20 = Seq("Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen")
  private val ten = Seq("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")

  private def two(num: Int): String = if (num == 0) ""
  else if (num < 10) one(num)
  else if (num < 20) twoLessThan20(num - 10)
  else {
    val tenner = num / 10
    val rest = num - tenner * 10
    if (rest != 0)
      ten(tenner) + " " + one(rest)
    else ten(tenner)
  }

  private def three(num: Int): String = {
    val hundred = num / 100
    val rest = num - hundred * 100
    if (hundred * rest != 0)
      one(hundred) + " Hundred " + two(rest)
    else if ((hundred == 0) && (rest != 0))
      two(rest)
    else if ((hundred != 0) && (rest == 0))
      one(hundred) + " Hundred"
    else
      ""
  }

  def numberToWords(num: Int): String = {
    if (num == 0) return "Zero"

    val billion = num / 1000000000
    val million = (num - billion * 1000000000) / 1000000
    val thousand = (num - billion * 1000000000 - million * 1000000) / 1000
    val rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000

    var result = ""
    if (billion != 0) result = three(billion) + " Billion"
    if (million != 0) {
      if (!result.isEmpty) result += " "
      result += three(million) + " Million"
    }
    if (thousand != 0) {
      if (!result.isEmpty) result += " "
      result += three(thousand) + " Thousand"
    }
    if (rest != 0) {
      if (!result.isEmpty) result += " "
      result += three(rest)
    }
    result
  }
}
