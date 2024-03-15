public class reverse_pairs {

    public int solve(int[] A) {
        int n = A.length;
        return mergesort_and_count(A, 0, n - 1);
    }

    public void merge(int a[], int start, int mid, int end) {
        int n1 = (mid - start + 1);
        int n2 = (end - mid);
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = a[start + i];
        for (int j = 0; j < n2; j++)
            R[j] = a[mid + 1 + j];
        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if (j >= n2 || (i < n1 && L[i] <= R[j]))
                a[k] = L[i++];
            else
                a[k] = R[j++];
        }
    }

    public int mergesort_and_count(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            // divide the array into two half and sort them
            int count = mergesort_and_count(a, start, mid) + mergesort_and_count(a, mid + 1, end);
            // count the number of pairs
            int j = mid + 1;
            for (int i = start; i <= mid; i++) {
                while (j <= end && 1l * a[i] > a[j] * 2l)
                    j++;
                count += j - (mid + 1);
            }
            merge(a, start, mid, end);
            return count;
        } else
            return 0;
    }
}