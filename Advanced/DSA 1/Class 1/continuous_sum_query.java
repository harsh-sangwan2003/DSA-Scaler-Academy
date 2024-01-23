public class continuous_sum_query {

    public int[] solve(int A, int[][] B) {

        int[] arr = new int[A];

        for (int i = 0; i < B.length; i++) {

            int st = B[i][0], et = B[i][1], val = B[i][2];

            arr[st - 1] += val;

            if (et < A)
                arr[et] -= val;
        }

        for (int i = 1; i < arr.length; i++)
            arr[i] += arr[i - 1];

        return arr;
    }
}
