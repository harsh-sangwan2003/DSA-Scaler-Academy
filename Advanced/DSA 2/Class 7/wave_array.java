import java.util.ArrayList;
import java.util.Collections;

public class wave_array {

    public int[] wave(int[] A) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : A)
            list.add(val);

        // sort the array
        Collections.sort(list);
        int n = list.size();
        // swap adjacent elements in pairs
        for (int i = 2; i <= n; i += 2) {
            exch(list, i - 2, i - 1);
        }

        int idx = 0;
        for (int val : list)
            A[idx++] = val;

        return A;
    }

    private void exch(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}