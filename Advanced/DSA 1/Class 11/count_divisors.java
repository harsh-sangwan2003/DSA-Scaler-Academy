import java.util.HashMap;

public class count_divisors {

    private int findMax(int[] arr) {

        int max = arr[0];

        for (int val : arr)
            max = Math.max(max, val);

        return max;
    }

    public int[] solve(int[] A) {

        int max = findMax(A);
        int[] spf = new int[max + 1];

        for (int i = 0; i < spf.length; i++)
            spf[i] = i;

        for (int i = 2; i <= Math.sqrt(max); i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= max; j += i) {

                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }

        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            int val = A[i];
            HashMap<Integer, Integer> map = new HashMap<>();

            while (val > 1) {

                int d = spf[val];
                map.put(d, map.getOrDefault(d, 0) + 1);
                val /= d;
            }

            int ans = 1;
            for (int key : map.keySet()) {

                ans *= (map.get(key) + 1);
            }

            arr[i] = ans;
        }

        return arr;
    }
}
