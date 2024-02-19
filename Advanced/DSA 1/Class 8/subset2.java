import java.util.*;

public class subset2 {

    public int[][] subsetsWithDup(int[] A) {

        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        generate(A,res,new ArrayList<>(),0);

        int[][] arr = new int[res.size()][];
        int idx1 = 0;

        for(ArrayList<Integer> list : res){

            int[] temp = new int[list.size()];
            int idx2 = 0;

            for(int val : list)
            temp[idx2++] = val;

            arr[idx1++] = temp;
        }

        return arr;
    }

    private void generate(int[] arr, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int idx){

        if(!res.contains(list))
        res.add(new ArrayList<>(list));

        for(int i=idx; i<arr.length; i++){

            list.add(arr[i]);
            generate(arr,res,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
