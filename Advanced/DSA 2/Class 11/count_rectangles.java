public class count_rectangles {

    public int solve(int[] A, int B) {

        int l = 0, r = A.length - 1;
        long count = 0, mod = (1000000000 + 7);

        while (r >= 0 && l < A.length) {
            long curr = (long) A[l] * A[r];

            if (curr < B) {
                count = (count + r + 1) % mod;
                l++;
            } else {
                r--;
            }
        }

        return (int) count;
    }
}
