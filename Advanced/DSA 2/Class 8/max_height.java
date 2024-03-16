public class max_height {

    public int solve(int A) {

        int ans = 1, sum = 1, val = 2;

        while (sum <= A) {

            sum += val;
            ans = val;
            val++;
        }

        return ans - 1;
    }
}
