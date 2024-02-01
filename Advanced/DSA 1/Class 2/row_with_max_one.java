public class row_with_max_one {
    public int solve(int[][] A) {

        int r = 0, c = A[0].length-1, ans = 0;

        while(r<A.length && c>=0){

            while(c>=0 && A[r][c]==1){

                ans = r;
                c-=1;
            }

            r++;
        }

        return ans;
    }
}
