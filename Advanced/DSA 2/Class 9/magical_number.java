public class magical_number {

    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }

    public int solve(int A, int B, int C) {
        // lcm of B and C
        long lcm = (long) B * C / gcd(B, C);
        long low = 2, high = ((long) A * Math.min(B, C)), ans = 0;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            // f(x) = x / B + x / C - x / lcm(B, C)
            long cntB = mid / B, cntC = mid / C, cntBC = mid / lcm;
            if (cntB + cntC - cntBC >= A) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return (int) (ans % (1000 * 1000 * 1000 + 7));
    }
}