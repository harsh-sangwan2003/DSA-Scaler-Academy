import java.util.Arrays;

public class min_abs_diff {

    public int solve(int[] A) {

        Arrays.sort(A);
        int diff = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++) {

            int curr = Math.abs(A[i] - A[i - 1]);
            diff = Math.min(curr, diff);
        }

        return diff;
    }
}
