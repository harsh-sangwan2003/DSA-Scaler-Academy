import java.util.HashSet;

public class sub_array_sum {
    // Do not write code to include libraries, main() function or accept any input
    // from the console.
    // Initialization code is already written and hidden from you. Do not write code
    // for it again.
    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is
        // available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this
        // function.
        HashSet<Long> set = new HashSet<>();
        long[] pre = new long[A.length];

        pre[0] = A[0];
        set.add(pre[0]);

        for (int i = 1; i < A.length; i++) {

            pre[i] = pre[i - 1] + A[i];

            if (pre[i] == 0 || set.contains(pre[i]))
                return 1;

            set.add(pre[i]);
        }

        return 0;
    }
}
