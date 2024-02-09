public class strange_equality {
    public int solve(int A) {

        int x = 0, y = 1, temp = A, idx = 0;

        while (temp != 0) {

            if ((temp & (1 << 0)) == 0)
                x += (1 << idx);

            idx++;
            temp = temp >> 1;
        }

        int bits = 0;

        while (A != 0) {

            bits++;
            A = A >> 1;
        }

        y = (1 << bits);

        return x ^ y;
    }
}
