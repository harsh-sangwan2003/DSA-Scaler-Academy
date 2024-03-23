public class container_with_water {

    public int maxArea(int[] A) {

        int res = 0, i = 0, j = A.length - 1;

        while (i < j) {

            int curr = Math.min(A[i], A[j]) * (j - i);
            res = Math.max(res, curr);

            if (A[i] < A[j])
                i++;

            else if (A[j] < A[i])
                j--;

            else {
                i++;
                j--;
            }
        }

        return res;
    }
}
