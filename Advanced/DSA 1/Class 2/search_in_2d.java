public class search_in_2d {
    public int solve(int[][] A, int B) {

        int r = 0, c = A[0].length-1, res = -1;

        while(r<A.length && c>=0){

            if(A[r][c]==B){

                if(res==-1 || ((r+1)*1009 + (c+1))<res)
                res = ((r+1)*1009 + (c+1));

                c--;
            }

            else if(A[r][c]>B)
            c--;

            else
            r++;
        }

        return res;
    }
}
