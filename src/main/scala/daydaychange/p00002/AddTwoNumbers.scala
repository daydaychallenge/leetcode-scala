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
    val result = ListNode(0)
    addTwoNumbersFP(result, Some(l1), Some(l2))
    result
  }

  @tailrec
  def addTwoNumbersFP(node: ListNode, l1: Option[ListNode], l2: Option[ListNode]): Unit = {
    val sum = l1.map(_.x).getOrElse(0) + l2.map(_.x).getOrElse(0) + node.x
    node.x = sum % 10
    if (l1.isDefined || l2.isDefined || sum >= 10) {
      node.next = Some(ListNode(sum / 10))
      addTwoNumbersFP(
        node.next.get,
        l1.flatMap(_.next),
        l2.flatMap(_.next)
      )
    }
  }
}
