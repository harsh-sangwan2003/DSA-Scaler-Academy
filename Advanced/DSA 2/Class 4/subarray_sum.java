import java.util.HashMap;

public class subarray_sum {

    public int solve(int[] A, int B) {

        int count = 0;

        for (int i = 1; i < A.length; i++)
            A[i] += A[i - 1];

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int val : A) {

            int comp = val - B;

            if (map.containsKey(comp))
                count += map.get(comp);

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return count;
    }
}
