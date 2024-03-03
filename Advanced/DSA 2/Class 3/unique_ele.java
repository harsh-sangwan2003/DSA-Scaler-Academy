import java.util.HashMap;

public class unique_ele {

    public int solve(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        int count = 0;

        for (int val : map.keySet()) {

            if (map.get(val) == 1)
                count++;
        }

        return count;
    }
}
