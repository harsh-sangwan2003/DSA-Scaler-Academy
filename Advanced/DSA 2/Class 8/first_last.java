public class first_last {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    private int firstIndex(int[] arr, int tar) {

        int l = 0, r = arr.length - 1, ans = -1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] == tar) {
                ans = m;
                r = m - 1;
            }

            else if (arr[m] > tar)
                r = m - 1;

            else
                l = m + 1;
        }

        return ans;
    }

    private int lastIndex(int[] arr, int tar) {

        int l = 0, r = arr.length - 1, ans = -1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] == tar) {
                ans = m;
                l = m + 1;
            }

            else if (arr[m] > tar)
                r = m - 1;

            else
                l = m + 1;
        }

        return ans;
    }

    public int[] searchRange(final int[] A, int B) {

        int[] res = new int[2];

        int fi = firstIndex(A, B);
        int li = lastIndex(A, B);

        res[0] = fi;
        res[1] = li;

        return res;
    }
}
