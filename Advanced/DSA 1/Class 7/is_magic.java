public class is_magic {

    public int solve(int A) {

        if (A == 1)
            return 1;

        if (A / 10 == 0 && A != 1)
            return 0;

        int res = 0;

        while (A != 0) {

            int ld = A % 10;
            A /= 10;
            res += ld;
        }

        if (res == 1)
            return 1;

        res = solve(res);

        if (res == 1)
            return 1;

        return 0;
    }
}
