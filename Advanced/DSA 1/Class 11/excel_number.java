public class excel_number {

    public int titleToNumber(String A) {

        int res = 0, mul = 1;

        for (int i = A.length() - 1; i >= 0; i--) {

            char ch = A.charAt(i);

            res += (ch - 'A' + 1) * mul;
            mul *= 26;
        }

        return res;
    }
}
