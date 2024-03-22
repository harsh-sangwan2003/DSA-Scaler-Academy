public class Solution {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> nums1, final List<Integer> nums2) {
        if (nums2.size() < nums1.size())
            return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.size();
        int n2 = nums2.size();
        int low = 0, high = n1;
        while (low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1.get(cut1 - 1);
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2.get(cut2 - 1);
            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1.get(cut1);
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2.get(cut2);
            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0)
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                else
                    return Math.max(left1, left2);
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}