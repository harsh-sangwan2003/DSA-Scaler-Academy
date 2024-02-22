public class title_to_number {

    public int titleToNumber(String A) {

        int res = 0;
        int mul = 1;

        for (int i = A.length() - 1; i >= 0; i--) {

            res += mul * (A.charAt(i) - 'A' + 1);
            mul *= 26;
        }

        return res;
    }
}
