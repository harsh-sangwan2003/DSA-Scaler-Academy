public class sum_of_all_submatrices {
    public int solve(int[][] A) {

        int sum = 0;

        for(int i=0; i<A.length; i++){

            for(int j=0; j<A[0].length; j++){

                int top_left = (i+1)*(j+1);
                int bottom_right = (A.length-i)*(A[0].length-j);
                int contri = A[i][j]*top_left*bottom_right;
                sum += contri;
            }
        }

        return sum;
    }
}
