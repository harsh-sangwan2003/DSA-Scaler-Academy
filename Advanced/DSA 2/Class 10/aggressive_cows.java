import java.util.Arrays;

public class aggressive_cows {

    public boolean check(int x, int[] A, int c) {
        int j = 0, n = A.length;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] - A[j] >= x) {
                j = i;
                cnt++;
            }
        }
        return (cnt >= c);
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int l = 1, r = 1000 * 1000 * 1000;
        int ans = 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (check(mid, A, B)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}