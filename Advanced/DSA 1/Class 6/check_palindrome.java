public class check_palindrome {
    public int solve(String A) {

        return helper(A, 0, A.length() - 1);
    }

    private int helper(String A, int i, int j) {

        if (i > j)
            return 1;

        if (A.charAt(i) != A.charAt(j))
            return 0;

        return helper(A, i + 1, j - 1);
    }
}
