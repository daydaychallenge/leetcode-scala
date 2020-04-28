package daydaychange.p00369

import org.specs2.mutable.Specification

class PlusOneLinkedListUnit extends Specification {
  "PlusOneLinkedListUnit" should {
    val node1 = new ListNode(1)
    val node2 = new ListNode(2)
    node1.next = node2
    val node3 = new ListNode(3)
    node2.next = node3

    val result = PlusOneLinkedList.plusOne(node1)
    result.x mustEqual 1
    result.next.x mustEqual 2
    result.next.next.x mustEqual 4
  }
}
