import java.util.HashMap;

public class subarray_with_given_sum {

    public int[] solve(int[] A, int B) {

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        int st = -1, et = -1;
        long[] pre = new long[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = A[i] * 1L;

            else
                pre[i] = A[i] + pre[i - 1];
        }

        for (int i = 0; i < A.length; i++) {

            long comp = pre[i] - B;

            if (pre[i] == B) {

                st = 0;
                et = i;
                break;
            }

            else if (map.containsKey(comp)) {

                st = map.get(comp) + 1;
                et = i;
                break;
            }

            map.put(pre[i], i);
        }

        if (st == -1 && et == -1) {

            return new int[] { -1 };
        }

        int[] res = new int[et - st + 1];

        for (int i = 0; i < res.length; i++) {

            res[i] = A[st + i];
        }

        return res;
    }
}
