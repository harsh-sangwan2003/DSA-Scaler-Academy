public class square_root {

    public int sqrt(int A) {

        if (A == 0 || A == 1)
            return A;

        long l = 1, r = A, ans = 0;

        while (l <= r) {

            long m = l + (r - l) / 2;

            if (m * m == A)
                return (int) (m);

            else if (m * m < A) {
                ans = m;
                l = m + 1;
            }

            else
                r = m - 1;
        }

        return (int) (ans);
    }
}
