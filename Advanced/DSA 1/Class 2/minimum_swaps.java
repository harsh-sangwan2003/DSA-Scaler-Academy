public class Solution {
    public int solve(int[] A, int B) {

        int wind = 0;
        for(int i=0; i<A.length; i++){

            if(A[i]<=B)
            wind++;
        }

        if(wind<=1)
        return 0;

        int l = 0, r = 0, x = 0, ans = -1;
        while(r<wind){

            if(A[r]>B)
            x++;

            r++;
        }

        ans = x;
        while(r<A.length){

            if(A[l]>B)
            x--;

            if(A[r]>B)
            x++;

            ans = Math.min(ans,x);
            l++;
            r++;            
        }

        return ans;

    }
}
