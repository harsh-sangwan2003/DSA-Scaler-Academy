import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class tens_digit_sorting {

    public int[] solve(int[] A) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : A)
            list.add(val);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer tens_digit1 = (val1 / 10) % 10;
                Integer tens_digit2 = (val2 / 10) % 10;
                if (tens_digit1 == tens_digit2) {
                    return val2 - val1;
                }
                return tens_digit1 - tens_digit2;
            }
        });

        int idx = 0;

        for (int val : list)
            A[idx++] = val;

        return A;
    }
}