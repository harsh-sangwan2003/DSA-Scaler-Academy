import java.util.PriorityQueue;

public class closest_point {

    public int[][] solve(int[][] A, int B) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for (int[] p : A) {
            pq.offer(p);
            if (pq.size() > B) {
                pq.poll();
            }
        }
        int[][] res = new int[B][2];
        while (B > 0) {
            res[--B] = pq.poll();
        }
        return res;
    }
}