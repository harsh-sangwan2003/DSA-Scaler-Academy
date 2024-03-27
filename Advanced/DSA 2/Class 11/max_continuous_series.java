import java.util.ArrayList;

public class max_continuous_series {

    public int[] maxone(int[] A, int B) {
        ArrayList<Integer> zeroPos = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (A == null)
            return new int[] {};
        int n = A.length;
        // store the index of all the 0's
        for (int i = 0; i < n; i++) {
            int num = A[i];
            if (num == 0)
                zeroPos.add(i);
        }
        if (B >= zeroPos.size()) {
            for (int i = 0; i < n; i++)
                res.add(i);

            return helper(res);
        }
        int i = 0;
        int j = B;
        int maxSize = 0;
        int start, end;
        start = 0;
        // find the longest segment by removing B 0's
        while (j <= zeroPos.size()) {
            if (j == zeroPos.size())
                end = n - 1;
            else
                end = zeroPos.get(j) - 1;

            int size = end - start + 1;

            if (size > maxSize) {
                maxSize = size;
                res.clear();
                res.add(start);
                res.add(end);
            }

            if (j == zeroPos.size())
                break;

            start = zeroPos.get(i) + 1;
            i++;
            j++;
        }
        start = res.get(0);
        end = res.get(1);
        res.clear();
        for (i = start; i <= end; i++)
            res.add(i);
        return helper(res);
    }

    private int[] helper(ArrayList<Integer> res) {

        int[] arr = new int[res.size()];
        int idx = 0;

        for (int val : res)
            arr[idx++] = val;

        return arr;
    }
}