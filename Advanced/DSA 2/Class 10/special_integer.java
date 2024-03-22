public class special_integer {

    public void prefix_function(int[] A, long[] prefix) {
        // calculating the prefix sum
        for (int i = 0; i < A.length; ++i) {
            prefix[i] = A[i];
            if (i > 0)
                prefix[i] += prefix[i - 1];
        }
    }

    public int solve(int[] A, int B) {
        long[] prefix = new long[A.length];
        prefix_function(A, prefix);
        // Binary search for the length
        int lo = 1;
        int hi = A.length, ans = 0;
        while (lo <= hi) {
            int mid = (hi - lo) / 2 + lo; // to keep our mid towards the right
            if (check(mid, prefix, (long) B) == 1) {
                hi = mid - 1;
            } else {
                ans = mid;
                lo = mid + 1;
            }
        }
        return ans;
    }

    // Checks if there is a subarray of size s whose sum is greater than sm in
    // linear time
    int check(int s, long[] arr, long sm) {
        int flag = 0;
        for (int i = s - 1; i < arr.length; ++i) {
            if (i == s - 1) {
                if (arr[i] > sm)
                    return 1;
            } else if (arr[i] - arr[i - s] > sm) {
                return 1;
            }
        }
        return 0;
    }
}