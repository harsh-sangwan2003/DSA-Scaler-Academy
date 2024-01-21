import java.util.Set;
import java.util.HashSet;

public class colorful_number {
    
    public int colorful(int A) {

        Set<Integer> set = new HashSet<>();
        String str = Integer.toString(A);

        int temp = A;

        while (temp != 0) {

            int ld = temp % 10;

            if (set.contains(ld))
                return 0;

            set.add(ld);
            temp /= 10;
        }

        int n = str.length();

        for (int i = 0; i < n; i++) {

            int prod = Integer.parseInt(str.charAt(i) + "");
            for (int j = i + 1; j < n; j++) {

                prod *= Character.getNumericValue(str.charAt(j));

                if (set.contains(prod))
                    return 0;

                set.add(prod);
            }
        }

        return 1;
    }
}
