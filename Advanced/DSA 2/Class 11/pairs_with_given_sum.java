public class pairs_with_given_sum {

    public int solve(int[] A, int B) {

        long ans = 0L;
        int mod = (int) (1e9 + 7);

        int i = 0, j = A.length - 1;

        while (i < j) {

            int sum = A[i] + A[j];

            if (sum > B)
                j--;

            else if (sum < B)
                i++;

            else {

                if (A[i] == A[j]) {

                    int count = j - i + 1;
                    ans = (ans + (count) * 1L * (count - 1) / 2) % mod;
                    return (int) (ans % mod);
                }

                int i2 = i, count1 = 0;
                while (A[i] == A[i2]) {
                    i2++;
                    count1++;
                }
                i = i2;

                int j2 = j, count2 = 0;
                while (A[j] == A[j2]) {
                    j2--;
                    count2++;
                }
                j = j2;

                ans = (ans + count1 * 1L * count2) % mod;
            }
        }

        return (int) (ans % mod);
    }
}
