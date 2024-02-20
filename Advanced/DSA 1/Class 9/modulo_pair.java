import java.util.*;

public class modulo_pair {

    public int solve(int[] A, int B) {

        long ans = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < A.length; i++)
            A[i] = A[i] % B;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);

            else
                map.put(A[i], 1);
        }

        long count = map.getOrDefault(0, 0);
        ans = (count * (count - 1) / 2) % mod;

        if (B % 2 == 0) {

            count = map.getOrDefault(B / 2, 0);
            ans = (ans + count * (count - 1) / 2) % mod;
        }

        for (int i = 1; i < (B + 1) / 2; i++) {

            ans = (ans + map.getOrDefault(i, 0) * map.getOrDefault(B - i, 0)) % mod;
        }

        return (int) ans % mod;
    }
}
