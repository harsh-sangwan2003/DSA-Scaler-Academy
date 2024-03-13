public class max_chunks {

    public int solve(int[] A) {

        int count = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            max = Math.max(max, A[i]);

            if (max == i)
                count += 1;
        }

        return count;
    }
}
