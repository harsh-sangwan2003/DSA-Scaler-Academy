public class single_element {

    public int solve(int[] A) {

        int l = 0, r = A.length - 1;

        if (A.length == 1)
            return A[0];
        if (A[0] != A[1])
            return A[0];
        if (A[A.length - 1] != A[A.length - 2])
            return A[A.length - 1];

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1])
                return A[mid];

            if (A[mid] == A[mid - 1])
                mid = mid - 1;

            if (mid < 0)
                break;

            if (mid % 2 == 0)
                l = mid + 2;

            else
                r = mid - 1;
        }

        return -1;
    }
}
