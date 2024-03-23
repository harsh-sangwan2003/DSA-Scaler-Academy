public class subarray_with_sum {

    public int[] solve(int[] A, int B) {

        int st = -1, et = -1;
        int i = 0, j = 0, sum = A[i];

        while (j < A.length) {

            if (sum == B) {
                st = i;
                et = j;
                break;
            }

            else if (sum < B) {
                j++;
                if (j < A.length)
                    sum += A[j];
            }

            else {
                sum -= A[i];
                i++;

                if (i > j && i < A.length) {
                    j = i;
                    sum += A[j];
                }
            }
        }

        if (st == -1 && et == -1)
            return new int[] { -1 };

        int len = et - st + 1;
        int[] res = new int[len];
        int idx = 0;

        for (int p = st; p <= et; p++)
            res[idx++] = A[p];

        return res;
    }
}
