public class closest_pair {
    
    public int[] solve(int[] a, int[] b, int c) {
        int n = a.length, m = b.length;
        int l = 0, r = m-1;
        long dif = (long)(2e9);
        int ans[] = new int[]{-1, -1};
        while(l < n && r >= 0) {
            if(Math.abs(a[l] + b[r] - c) < dif) {
                // update the ans
                dif = Math.abs(a[l] + b[r] - c);
                ans[0] = a[l];  ans[1] = b[r];
            }
            else if(Math.abs(a[l] + b[r] - c) == dif && ans[0] == a[l]){
                // check for the smallest index
                ans[1] = b[r];
            }
            if(a[l] + b[r] >= c) 
                r--;
            else    
                l++;
        }
        return ans;
    }
}