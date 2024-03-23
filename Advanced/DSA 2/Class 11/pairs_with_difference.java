import java.util.Arrays;

public class pairs_with_difference {

    public int solve(int[] A, int B) {

        Arrays.sort(A);

        int i = 0, j = 1, count = 0;

        while (j < A.length) {

            if (j == i) {
                j++;
                continue;
            }

            int x = A[i], y = A[j];
            int diff = y - x;

            if (diff == B) {

                count++;

                while (i < A.length && A[i] == x)
                    i++;
                while (j < A.length && A[j] == y)
                    j++;
            }

            else if (diff < B)
                j++;

            else
                i++;
        }

        return count;
    }
}
