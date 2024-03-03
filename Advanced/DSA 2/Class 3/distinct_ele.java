import java.util.HashSet;

public class distinct_ele {

    public int solve(int[] A) {

        HashSet<Integer> set = new HashSet<>();

        for (int val : A)
            set.add(val);

        return set.size();
    }
}
