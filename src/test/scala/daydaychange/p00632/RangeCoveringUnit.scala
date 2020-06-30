package daydaychange.p00632

import org.specs2.mutable.Specification

class RangeCoveringUnit extends Specification {
  Solution.smallestRange(
    List(
      List(4, 10, 15, 24, 26),
      List(0, 9, 12, 20),
      List(5, 18, 22, 30)
    )
  ) mustEqual Array(20, 24)
}
