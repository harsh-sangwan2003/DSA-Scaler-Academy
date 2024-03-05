import java.util.HashMap;

public class count_pair_difference {

    public int solve(int[] A, int B) {

        long count = 0L;
        int mod = (int) (1e9) + 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int val : A) {

            int comp = val - B;

            if (map.containsKey(comp))
                count = (count + map.get(comp)) % mod;

        }

        return (int) (count % mod);
    }
}
