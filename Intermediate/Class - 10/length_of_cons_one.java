public class length_of_cons_one {
    
    public int solve(String A) {

        int countOne = 0, max = 0;

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == '1')
                countOne++;
        }

        if (countOne == A.length())
            return countOne;

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == '0') {

                int left = 0, right = 0, j = i - 1;

                while (j >= 0 && A.charAt(j) == '1') {
                    left++;
                    j--;
                }

                j = i + 1;

                while (j < A.length() && A.charAt(j) == '1') {
                    right++;
                    j++;
                }

                if (left + right == countOne)
                    max = Math.max(max, left + right);

                else
                    max = Math.max(max, left + right + 1);
            }
        }

        return max;
    }
}
