public class inversion_count {

    private int Mod = 1000 * 1000 * 1000 + 7;

    public int solve(int[] A) {
        return (int) mergeSort(A);
    }

    public long mergeSort(int[] A) {
        int[] temp = new int[A.length];
        return _mergeSort(A, temp, 0, A.length - 1) % Mod;
    }

    public long _mergeSort(int arr[], int temp[], int left, int right) {
        int mid;
        long inv_count = 0;
        if (right > left) {
            /*
             * Divide the array into two parts and
             * call _mergeSortAndCountInv()
             * for each of the parts
             */
            mid = (right + left) / 2;
            /*
             * Inversion count will be sum of
             * inversions in left-part, right-part
             * and number of inversions in merging
             */
            inv_count += _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            /* Merge the two parts */
            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count % Mod;
    }

    public long merge(int arr[], int temp[], int left, int mid, int right) {
        int i, j, k;
        long inv_count = 0;
        i = left; /* i is index for left subarray */
        j = mid; /* j is index for right subarray */
        k = left; /* k is index for resultant merged subarray */
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
        /*
         * Copy the remaining elements of left subarray
         * (if there are any) to temp
         */
        while (i <= mid - 1)
            temp[k++] = arr[i++];
        /*
         * Copy the remaining elements of right subarray
         * (if there are any) to temp
         */
        while (j <= right)
            temp[k++] = arr[j++];
        /* Copy back the merged elements to original array */
        for (i = left; i <= right; i++)
            arr[i] = temp[i];
        return inv_count % Mod;
    }
}