import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();
        heap.add(1L);
        seen.add(1L);
        long ugly = 1L;
        for (int i = 0; i < n; i++) {
            ugly = heap.poll();
            long nextUgly2 = ugly * 2;
            long nextUgly3 = ugly * 3;
            long nextUgly5 = ugly * 5;
            if (seen.add(nextUgly2)) {
                heap.add(nextUgly2);
            }
            if (seen.add(nextUgly3)) {
                heap.add(nextUgly3);
            }
            if (seen.add(nextUgly5)) {
                heap.add(nextUgly5);
            }
        }
        return (int) ugly;
    }
}
