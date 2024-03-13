public class count_sort {

    public int[] solve(int[] A) {

        int n = A.length;
        int[] res = new int[n];

        int max = Integer.MIN_VALUE;
        for (int val : A)
            max = Math.max(val, max);

        int[] freq = new int[max + 1];
        for (int val : A)
            freq[val]++;

        int idx = 0;
        for (int i = 0; i < freq.length; i++) {

            for (int j = 1; j <= freq[i]; j++) {
                res[idx++] = i;
            }
        }

        return res;
    }
}
