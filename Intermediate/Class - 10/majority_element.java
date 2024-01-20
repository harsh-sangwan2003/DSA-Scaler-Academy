class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int ele = A[0], count = 1;

        for (int i = 1; i < A.length; i++) {

            if (count == 0) {

                ele = A[i];
                count++;
            }

            else {

                if (A[i] == ele)
                    count++;

                else
                    count--;
            }
        }

        return ele;
    }
}
