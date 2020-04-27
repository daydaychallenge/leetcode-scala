package daydaychange.p00369

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object PlusOneLinkedList {
  def plusOne(params: ListNode): ListNode = {
    var head = params
    val sentinel = new ListNode(0)
    sentinel.next = head
    var notNine = sentinel
    while ( {
      head != null
    }) {
      if (head.x != 9) notNine = head
      head = head.next
    }
    notNine.x += 1
    notNine = notNine.next
    while ( {
      notNine != null
    }) {
      notNine.x = 0
      notNine = notNine.next
    }
    if (sentinel.x != 0)
      sentinel
    else
      sentinel.next
  }
}
