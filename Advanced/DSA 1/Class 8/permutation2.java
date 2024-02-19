import java.util.*;

public class permutation2 {
    public int[][] permute(int[] nums) {

        Arrays.sort(nums); // Sort the array to handle duplicates
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        
        helper(nums, new ArrayList<>(), res, visited);
        int[][] arr = new int[res.size()][];
        int idx1 = 0;

        for(List<Integer> val : res){

            int[] temp = new int[val.size()];
            int idx2 = 0;

            for(int x : val)
            temp[idx2++] = x;

            arr[idx1++] = temp;
        }

        return arr;
    }

    private void helper(int[] nums, List<Integer> current, List<List<Integer>> res, boolean[] visited) {
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }

            current.add(nums[i]);
            visited[i] = true;
            helper(nums, current, res, visited);
            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
