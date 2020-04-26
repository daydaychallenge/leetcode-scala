package daydaychange.p00002

import scala.annotation.tailrec

case class ListNode(var x: Int, var next: Option[ListNode] = None) {

}

object AddTwoNumbers {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val dummyHead: ListNode = ListNode(0)
    var p: Option[ListNode] = Some(l1)
    var q: Option[ListNode] = Some(l2)
    var curr: ListNode = dummyHead
    var carry: Int = 0
    while (p.isDefined || q.isDefined) {
      val sum: Int = carry + p.map(_.x).getOrElse(0) + q.map(_.x).getOrElse(0)
      carry = sum / 10
      curr.next = Some(ListNode(sum % 10))
      curr = curr.next.get
      p = p.flatMap(_.next)
      q = q.flatMap(_.next)
    }
    if (carry > 0) {
      curr.next = Some(ListNode(carry))
    }
    dummyHead.next.get
  }

  def addTwoNumbers2(l1: ListNode, l2: ListNode): ListNode = {
    addTwoNumbersFP(Some(l1), Some(l2), 0).get
  }

  def addTwoNumbersFP(l1: Option[ListNode], l2: Option[ListNode], carry: Int): Option[ListNode] = {
    val result = l1.map(_.x).getOrElse(0) + l2.map(_.x).getOrElse(0) + carry
    if (l1.isDefined || l2.isDefined) {
      Some(ListNode(result % 10, addTwoNumbersFP(
        l1.flatMap(_.next),
        l2.flatMap(_.next), result / 10)
      ))
    } else {
      None
    }
  }
}
