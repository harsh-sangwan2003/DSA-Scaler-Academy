import java.util.ArrayList;

public class all_primes {

    public int[] solve(int A) {

        ArrayList<Integer> res = new ArrayList<>();
        boolean[] prime = new boolean[A + 1];

        for (int i = 2; i <= Math.sqrt(A); i++) {

            if (!prime[i]) {

                for (int j = i * i; j <= A; j += i)
                    prime[j] = true;
            }
        }

        for (int i = 2; i <= A; i++) {

            if (!prime[i])
                res.add(i);
        }

        int[] arr = new int[res.size()];
        int idx = 0;

        for (int val : res)
            arr[idx++] = val;

        return arr;
    }
}
