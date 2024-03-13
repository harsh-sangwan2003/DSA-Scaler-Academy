public class merge_arrays {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {

        int n1 = A.length, n2 = B.length;
        int[] res = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (A[i] < B[j]) {
                res[k++] = A[i];
                i++;
            }

            else {
                res[k++] = B[j];
                j++;
            }
        }

        while (i < n1) {
            res[k++] = A[i];
            i++;
        }

        while (j < n2) {
            res[k++] = B[j];
            j++;
        }

        return res;
    }
}
