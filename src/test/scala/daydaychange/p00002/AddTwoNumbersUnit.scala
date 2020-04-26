package daydaychange.p00002

import org.specs2.mutable.Specification

class AddTwoNumbersUnit extends Specification {
  "AddTwoNumbersUnit" should {
    val result = AddTwoNumbers.addTwoNumbers(
      ListNode(3, Some(ListNode(4, Some(ListNode(2))))),
      ListNode(4, Some(ListNode(6, Some(ListNode(5)))))
    )
    result.x mustEqual 7
    result.next.get.x mustEqual 0
    result.next.get.next.get.x mustEqual 8
    "" mustEqual ""
  }

  "AddTwoNumbersUnitFP" should {
    val result = AddTwoNumbers.addTwoNumbers2(
      ListNode(3, Some(ListNode(4, Some(ListNode(2))))),
      ListNode(4, Some(ListNode(6, Some(ListNode(5)))))
    )
    result.x mustEqual 7
    result.next.get.x mustEqual 0
    result.next.get.next.get.x mustEqual 8
    "" mustEqual ""
  }
}
