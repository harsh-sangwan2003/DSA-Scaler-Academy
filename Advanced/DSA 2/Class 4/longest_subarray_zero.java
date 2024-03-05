import java.util.HashMap;

public class longest_subarray_zero {

    public int solve(int[] A) {

        int ans = 0;
        long[] pre = new long[A.length];

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = A[i] * 1L;

            else
                pre[i] = A[i] + pre[i - 1];
        }

        for (int i = 0; i < A.length; i++) {

            if (pre[i] == 0) {

                int len = i + 1;
                ans = Math.max(ans, len);
            }

            else if (map.containsKey(pre[i])) {

                int len = i - map.get(pre[i]);
                ans = Math.max(ans, len);
            }

            else {

                map.put(pre[i], i);
            }
        }

        return ans;
    }
}
