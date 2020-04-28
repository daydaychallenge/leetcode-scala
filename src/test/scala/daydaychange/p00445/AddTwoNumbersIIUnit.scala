package daydaychange.p00445

import org.specs2.mutable.Specification

class AddTwoNumbersIIUnit extends Specification {
  def createList(seq: Int*): ListNode = {
    var result = new ListNode()
    var tmp = result
    seq.foreach(item => {
      tmp.next = new ListNode(item)
      tmp = tmp.next
    })
    result.next
  }

  "LongestPalindrome" should {
    val v1 = createList(9, 9, 9)
    val v2 = createList(9, 9)

    val result = AddTwoNumbersII.addTwoNumbers(v1, v2)
    result.x mustEqual 1
    result.next.x mustEqual 0
    result.next.next.x mustEqual 9
    result.next.next.next.x mustEqual 8
  }
}
