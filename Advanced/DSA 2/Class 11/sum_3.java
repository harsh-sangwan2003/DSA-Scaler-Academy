import java.util.Arrays;

public class sum_3 {

    public int threeSumClosest(int[] A, int B) {
        int n = A.length, diff = 1000000000, ans = -1;
        Arrays.sort(A);
        // fix the smallest number of the three integers
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (Math.abs(A[i] + A[j] + A[k] - B) < diff) {
                    diff = Math.abs(A[i] + A[j] + A[k] - B);
                    ans = A[i] + A[j] + A[k];
                }
                if (A[i] + A[j] + A[k] > B)
                    k--;
                else
                    j++;
            }
        }
        return ans;
    }
}