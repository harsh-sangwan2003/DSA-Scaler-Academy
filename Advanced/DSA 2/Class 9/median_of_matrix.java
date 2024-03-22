public class median_of_matrix {

    public int lowerBound(int A[], int val) {
        int l = 0, h = A.length - 1, ans = -1;
        while (l <= h) {
            int mid = (h - l) / 2 + l;
            if (A[mid] < val) {
                ans = mid;
                l = mid + 1;
            } else
                h = mid - 1;
        }
        return ans + 1;
    }

    public int findMedian(int[][] A) {
        int low = 0, high = 1000000000, n = A.length, m = A[0].length;
        int medPos = n * m / 2, ans = -1; // number of elements less than median element
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int cnt = 0;
            // count in each row numer of elements <= mid
            for (int i = 0; i < n; i++)
                cnt += lowerBound(A[i], mid);
            if (cnt > medPos)
                high = mid - 1;
            else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}