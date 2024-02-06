public class set_bit {
    public int solve(int A, int B) {

        int res = 0;
        res = res | (1<<A);
        res = res | (1<<B);

        return res;
    }
}
