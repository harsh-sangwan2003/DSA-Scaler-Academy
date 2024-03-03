import java.util.HashMap;

public class count_subarray_sum {

    public int solve(int[] A) {

        long count = 0;
        int mod = (int) (1e9) + 7;
        long[] pre = new long[A.length];
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = A[i];

            else
                pre[i] = pre[i - 1] + A[i];

            if (map.containsKey(pre[i])) {

                count += map.get(pre[i]);
                map.put(pre[i], map.get(pre[i]) + 1);
            }

            else {

                map.put(pre[i], 1);
            }
        }

        return (int) (count % mod);
    }
}
