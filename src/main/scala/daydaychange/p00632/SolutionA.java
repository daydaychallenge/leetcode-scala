package daydaychange.p00632;

import java.util.List;
import java.util.PriorityQueue;

public class SolutionA {
  public int[] smallestRange(List<List<Integer>> nums) {
    int res[] = new int[2];
    PriorityQueue<int[]> pq = new PriorityQueue<>((a1, a2) -> {
      return a1[0] - a2[0];
    });
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int cnt = 0;
    for (List<Integer> list : nums) {
      int a[] = new int[3];
      a[0] = list.get(0);
      a[1] = 0;
      a[2] = cnt++;
      min = Math.min(min, a[0]);
      max = Math.max(max, a[0]);
      pq.add(a);
    }
    res[0] = min;
    res[1] = max;
    while (true) {
      int tuple[] = pq.poll();
      int kth = tuple[2];
      int index = tuple[1];
      if (index == nums.get(kth).size() - 1) break;
      int next[] = new int[3];
      next[0] = nums.get(kth).get(index + 1);
      next[1] = index + 1;
      next[2] = kth;
      max = Math.max(max, next[0]);
      pq.add(next);
      if (res[1] - res[0] > max - pq.peek()[0]) {
        res[0] = pq.peek()[0];
        res[1] = max;
      }
    }
    return res;
  }
}
