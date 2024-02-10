public class print_reverse {
    public void solve(int A) {

        helper(A);
        System.out.println();
    }

    private void helper(int A) {

        if (A == 0)
            return;

        System.out.print(A + " ");
        helper(A - 1);
    }
}
