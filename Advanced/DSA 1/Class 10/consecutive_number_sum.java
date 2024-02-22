public class consecutive_number_sum {

    public int solve(int A) {

        int count = 0;

        for (int k = 1; k <= Math.sqrt(2 * A); k++) {

            int T = A - k * (k - 1) / 2;

            if (T % k == 0)
                count++;
        }

        return count;
    }
}
