import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class factor_sort {
    
    Integer countFactors(Integer n) {
        Integer count = 0;
        for (Integer i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i * i != n) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] solve(int[] A) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : A)
            list.add(val);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer count1 = countFactors(val1);
                Integer count2 = countFactors(val2);
                if (count1 == count2) {
                    return val1 - val2;
                }
                return count1 - count2;
            }
        });

        int idx = 0;
        for (int val : list)
            A[idx++] = val;

        return A;
    }
}