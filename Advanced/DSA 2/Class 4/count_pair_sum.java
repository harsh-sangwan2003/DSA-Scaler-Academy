import java.util.HashMap;

public class count_pair_sum {

    public int solve(int[] A, int B) {

        long count = 0;
        int mod = (int) (1e9) + 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A) {

            int comp = B - val;

            if (map.containsKey(comp))
                count = (count + map.get(comp)) % mod;

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return (int) (count % mod);
    }
}
