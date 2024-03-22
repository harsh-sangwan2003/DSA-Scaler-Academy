import java.util.Arrays;

public class smallest {

    public int check(int[] A, int val) {
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            int s = i + 1, e = A.length - 1;
            while (s < e) {
                if (A[i] + A[s] + A[e] < val) {
                    cnt += e - s;
                    s++;
                } else {
                    e--;
                }
            }
        }
        return cnt;
    }

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int low = 0, high = A[n - 1] + A[n - 2] + A[n - 3], ans = 0;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            // count of triplets with sum less than mid
            int count = check(A, mid);
            if (count >= B) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}