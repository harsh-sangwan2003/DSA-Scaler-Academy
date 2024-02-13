import java.util.ArrayList;

public class tower_of_hanoi {
    
    public int[][] towerOfHanoi(int A) {

        ArrayList<int[]> res = new ArrayList<>();
        helper(A,1,2,3,res);

        int[][] ans = new int[res.size()][3];
        int idx = 0;

        for(int[] arr : res){

            ans[idx++] = arr;
        }

        return ans; 
    }

    private void helper(int n, int t1, int t2, int t3, ArrayList<int[]> res){

        if(n==0)
        return;

        helper(n-1,t1,t3,t2,res);

        int[] arr = new int[3];
        arr[0] = n; arr[1] = t1; arr[2] = t3;
        res.add(arr);

        helper(n-1,t2,t1,t3,res);
    }
}
