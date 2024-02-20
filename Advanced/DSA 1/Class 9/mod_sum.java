public class mod_sum {
    
    public int solve(int[] A) {

        int[] arr = new int[1001];

        for(int val : A)
        arr[val]++;

        long sum = 0;
        long mod = (int)(1e9+7);

        for(int i=1; i<1001; i++){

            for(int j=1; j<1001; j++){

                int val = i%j;
                long contri = (val*arr[i]*arr[j])%mod;
                sum = (sum+contri)%mod;
            }
        }

        return (int)sum;
    }
}
