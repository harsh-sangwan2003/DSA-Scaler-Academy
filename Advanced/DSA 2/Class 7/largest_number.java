import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class largest_number {

    public String largestNumber(int[] A) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : A)
            list.add(val);

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return (String.valueOf(b) + String.valueOf(a)).compareTo(String.valueOf(a) + String.valueOf(b));
            }
        });

        StringBuilder ans = new StringBuilder();
        for (int x : list) {
            ans.append(String.valueOf(x));
        }
        if (ans.charAt(0) == '0')
            return "0";
        return ans.toString();
    }
}