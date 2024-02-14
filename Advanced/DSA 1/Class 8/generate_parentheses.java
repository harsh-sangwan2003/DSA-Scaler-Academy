import java.util.ArrayList;

public class generate_parentheses {
    
    public String[] generateParenthesis(int A) {

        ArrayList<String> res = new ArrayList<>();
        helper(A,"",res,0,0);

        String[] ans = new String[res.size()];
        int idx = 0;

        for(String str : res){

            ans[idx++] = str;
        }

        return ans;
    }

    private void helper(int n, String str, ArrayList<String> res, int open, int close){

        if(str.length()>=2*n){

            res.add(str);
            return;
        }

        if(open<n)
        helper(n,str+"(",res,open+1,close);

        if(close<open)
        helper(n,str+")",res,open,close+1);
    }
}
