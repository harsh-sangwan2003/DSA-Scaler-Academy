import java.util.HashMap;

public class distinct_window {

    public int[] dNums(int[] A, int B) {

        int n = A.length;

        if (B > n)
            return new int[0];

        int[] res = new int[n - B + 1];
        int idx = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < B; i++)
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

        res[idx++] = map.size();

        for (int i = B; i < n; i++) {

            int prev = map.get(A[i - B]);

            if (prev == 1)
                map.remove(A[i - B]);
            else
                map.put(A[i - B], prev - 1);

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

            res[idx++] = map.size();
        }

        return res;
    }
}
