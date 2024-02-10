public class sum_of_digits {
    public int solve(int A) {

        if (A == 0 || A == 1)
            return A;

        int ld = A % 10;

        return ld + solve(A / 10);
    }
}
