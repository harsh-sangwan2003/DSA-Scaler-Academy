import java.util.ArrayList;

public class kth_symbol {
    public int solve(int A, int B) {

        ArrayList<Integer> list = new ArrayList<>();

        @SuppressWarnings("unchecked")
        ArrayList<Integer> res = helper(A,B,list);

        return res.get(B);
    }

    @SuppressWarnings("rawtypes")
    private ArrayList helper(int A, int B, ArrayList<Integer> list){

        if(A==1){

            list.add(0);
            return list;
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer> res = helper(A-1,B,list);

        ArrayList<Integer> curr = new ArrayList<>();

        for(int val : res){

            if(val==0){

                curr.add(0);
                curr.add(1);
            }

            else{

                curr.add(1);
                curr.add(0);
            }
        }

        return curr;
    }
}
