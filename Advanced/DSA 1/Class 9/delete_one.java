public class delete_one {

    private int gcd(int a, int b) {

        if (b == 0)
            return a;
        if (a == 0)
            return b;

        return gcd(b, a % b);
    }

    public int solve(int[] A) {

        int[] pgcd = new int[A.length];
        pgcd[0] = A[0];

        for (int i = 1; i < A.length; i++)
            pgcd[i] = gcd(A[i], pgcd[i - 1]);

        int[] sgcd = new int[A.length];
        sgcd[A.length - 1] = A[A.length - 1];

        for (int i = A.length - 2; i >= 0; i--)
            sgcd[i] = gcd(A[i], sgcd[i + 1]);

        int ans = Integer.MIN_VALUE;
        int curr = sgcd[1];
        ans = Math.max(ans, curr);
        curr = pgcd[A.length - 2];
        ans = Math.max(ans, curr);

        for (int i = 1; i < A.length - 1; i++) {

            int left = pgcd[i - 1];
            int right = sgcd[i + 1];
            curr = gcd(left, right);
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
