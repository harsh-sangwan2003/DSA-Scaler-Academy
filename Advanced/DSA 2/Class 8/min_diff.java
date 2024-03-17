import java.util.Arrays;

public class min_diff {

    public int solve(int A, int B, int[][] C) {
        
        int ans = 1000000000; // Initialize answer as a large number
        int lb;
        for (int i = 0; i < A; i++) {
            Arrays.sort(C[i]); // Sort each row of matrix
        }
        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < B; j++) {
                lb = lower_bound(C[i + 1], C[i][j]); // check for next element as in soltion
                if (lb != B) {
                    ans = Math.min(ans, Math.abs(C[i][j] - C[i + 1][lb])); // Update answer
                }
                if (lb != 0) {
                    ans = Math.min(ans, Math.abs(C[i][j] - C[i + 1][lb - 1]));
                }
            }
        }
        return ans;
    }

    // function used to find element index just greater than or equal to val
    public int lower_bound(int a[], int val) {
        int low = 0, high = a.length - 1, ans = a.length;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (a[mid] < val) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}