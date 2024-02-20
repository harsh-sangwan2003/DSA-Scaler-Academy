public class largest_coprime_divisor {

    public int cpFact(int A, int B) {

        while (gcd(A, B) != 1) {

            A /= gcd(A, B);
        }

        return A;
    }

    private int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
