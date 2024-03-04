public class prime_sum {

    public int[] sieve(int N) {

        int[] isPrime = new int[N + 1];
        isPrime[0] = 0;
        isPrime[1] = 0;
        for (int i = 2; i <= N; i++) {
            isPrime[i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i] == 0)
                continue;
            if (i > N / i)
                break;
            for (int j = i * i; j <= N; j += i)
                isPrime[j] = 0;
        }
        return isPrime;
    }

    public int[] primesum(int A) {
        int[] isPrime = sieve(A);
        int[] ans = new int[2];
        for (int i = 2; i <= A; ++i) {
            if (isPrime[i] == 1 && isPrime[A - i] == 1) {
                ans[0] = i;
                ans[1] = A - i;
                return ans;
            }
        }
        return ans;
    }
}