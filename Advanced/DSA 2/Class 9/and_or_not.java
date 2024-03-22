import java.util.Arrays;

public class and_or_not {

    public int[] solve(int[] A, int B) {
        // To do the prefix sum
        long prefix[] = new long[A.length + 1];
        Arrays.sort(A);
        int n = A.length;
        // Make prefix array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] += A[i] + prefix[i];
        }
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (int i = 0; i < n; i++) {
            int lo = 1, hi = i + 1;
            int mx = 0;
            // Binary search to find the value of cnt for each i
            while (lo <= hi) {
                int cnt = (lo + hi) / 2;
                if ((long) A[i] * cnt - (prefix[i + 1] - prefix[i - cnt + 1]) <= B) {
                    mx = cnt;
                    lo = cnt + 1;
                } else {
                    hi = cnt - 1;
                }
            }
            // Update ans
            if (ans[0] < mx) {
                ans[0] = mx;
                ans[1] = A[i];
            }
        }
        return ans;
    }
}