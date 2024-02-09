import java.util.Arrays;

public class min_xor_value {
    public int findMinXor(int[] A) {

        Arrays.sort(A);

        int min = Integer.MAX_VALUE;
        for(int i=1; i<A.length; i++){

            int xor = A[i]^A[i-1];

            if(xor<min)
            min = xor;
        }

        return min;
    }
}
