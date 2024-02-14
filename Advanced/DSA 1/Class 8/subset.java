import java.util.ArrayList;
import java.util.Arrays;

public class subset {
    
    public int[][] subsets(int[] A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(A);
        generateSubsets(A,0,res,new ArrayList<>());

        int[][] ans = new int[res.size()][];
        int idx1 = 0;

        for(ArrayList<Integer> list : res){

            int[] arr = new int[list.size()];
            int idx2 = 0;

            for(int val : list){
                arr[idx2++] = val;
            }

            ans[idx1++] = arr;
        }

        return ans;
    }

    private void generateSubsets(int[] arr, int idx, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list){

        res.add(new ArrayList<>(list));

        for(int i=idx; i<arr.length; i++){

            list.add(arr[i]);
            generateSubsets(arr, i+1, res, list);
            list.remove(list.size() - 1);
        }
    }
}
