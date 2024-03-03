public class sorted_rank {

    static int mod = 1000003;

    private int fact(int n) {

        if (n == 0 || n == 1)
            return n;

        return (n * fact(n - 1)) % mod;
    }

    public int findRank(String A) {

        long ans = 0L;

        for (int i = 0; i < A.length() - 1; i++) {

            int count = 0;
            for (int j = i + 1; j < A.length(); j++) {

                if (A.charAt(j) < A.charAt(i))
                    count++;
            }

            ans += (count * 1L * fact(A.length() - i - 1)) % mod;
        }

        ans = (ans + 1) % mod;
        return (int) ans;
    }
}
