public class next_permutation {

    private void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int[] nextPermutation(int[] A) {

        int n = A.length;

        int i = n - 2;
        while (i >= 0 && A[i] >= A[i + 1]) {
            i--;
        }

        if (i == -1) {
            reverse(A, 0, n - 1);
            return A;
        }

        int j = n - 1;
        while (A[j] <= A[i]) {
            j--;
        }

        swap(A, i, j);

        reverse(A, i + 1, n - 1);

        return A;
    }
}
