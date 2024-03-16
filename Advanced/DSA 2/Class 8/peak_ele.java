public class peak_ele {

    public int solve(int[] A) {

        int n = A.length;

        if (n == 1)
            return A[0];
        if (A[0] > A[1])
            return A[0];
        if (A[n - 1] > A[n - 2])
            return A[n - 1];

        int l = 0, r = n - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (A[m] >= A[m - 1] && A[m] >= A[m + 1])
                return A[m];

            else if (A[m] < A[m - 1])
                r = m - 1;

            else
                l = m + 1;
        }

        return -1;
    }
}
