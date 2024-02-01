public class minimum_swaps {
    public int solve(int[] A, int B) {

        int n = A.length;

        // Count the elements less than or equal to B
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                count++;
            }
        }

        // Initialize the minimum swaps needed within the window
        int minSwaps = Integer.MAX_VALUE;

        // Count the elements less than or equal to B in the initial window
        int currentCount = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] <= B) {
                currentCount++;
            }
        }

        // Iterate through the array with a sliding window
        for (int i = count; i < n; i++) {
            // Update the minimum swaps needed within the window
            minSwaps = Math.min(minSwaps, count - currentCount);

            // Update the count of elements less than or equal to B in the current window
            if (A[i] <= B) {
                currentCount++;
            }

            // Update the count of elements less than or equal to B leaving the window
            if (A[i - count] <= B) {
                currentCount--;
            }
        }

        // Update the minimum swaps needed for the last window
        minSwaps = Math.min(minSwaps, count - currentCount);

        return minSwaps;
    }
}
