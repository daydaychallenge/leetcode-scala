package daydaychange.p00445

class ListNode(var x: Int = 0) {
  var next: ListNode = null
}

object AddTwoNumbersII {


  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val v1 = new scala.collection.mutable.ListBuffer[Int]
    val v2 = new scala.collection.mutable.ListBuffer[Int]
    var tmp = l1
    while (tmp != null) {
      v1.append(tmp.x)
      tmp = tmp.next
    }
    tmp = l2
    while (tmp != null) {
      v2.append(tmp.x)
      tmp = tmp.next
    }
    var res = new ListNode(0)
    for (i <- 0 until Seq(v1.length, v2.length).max) {
      res.x = res.x + (if (i < v1.length) v1(v1.length - i - 1) else 0) + (if (i < v2.length) v2(v2.length - i - 1) else 0)
      val n = new ListNode(res.x / 10)
      n.next = res
      res.x = res.x % 10
      res = n
    }
    if (res.x == 0) {
      res.next
    } else {
      res
    }
  }
}
