import java.util.ArrayList;

public class permutation {
    
    public int[][] permute(int[] A) {

        boolean[] visited = new boolean[A.length];
        ArrayList<int[] > res = new ArrayList<>();

        helper(A,new int[A.length],0,res,visited);

        int[][] ans = new int[res.size()][];
        int idx = 0;

        for(int[] arr : res){

            ans[idx++] = arr;
        }

        return ans;
    }

    private void helper(int[] arr, int[] ans, int idx, ArrayList<int[]> res, boolean[] visited){

        if(idx>=arr.length){

            int[] temp = new int[ans.length];
            int i = 0;
            for(int val : ans)
            temp[i++] = val;

            res.add(temp);
            return;
        }

        for(int i=0; i<arr.length; i++){

            if(visited[i]==false){

                ans[idx] = arr[i];
                visited[i] = true;
                helper(arr,ans,idx+1,res,visited);
                visited[i] = false;
            }
        }
    }
}
