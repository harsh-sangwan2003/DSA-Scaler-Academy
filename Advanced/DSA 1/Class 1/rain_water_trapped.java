public class rain_water_trapped {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    public int trap(final int[] A) {

        int[] lmax = new int[A.length];
        int[] rmax = new int[A.length];

        lmax[0] = A[0];
        rmax[A.length - 1] = A[A.length - 1];

        for (int i = 1; i < lmax.length; i++)
            lmax[i] = Math.max(A[i], lmax[i - 1]);

        for (int i = A.length - 2; i >= 0; i--)
            rmax[i] = Math.max(A[i], rmax[i + 1]);

        int ans = 0;
        for (int i = 1; i < A.length - 1; i++) {

            int leftMax = lmax[i - 1], rightMax = rmax[i + 1];
            int water = Math.min(leftMax, rightMax) - A[i];

            if (water > 0)
                ans += water;
        }

        return ans;
    }
}
