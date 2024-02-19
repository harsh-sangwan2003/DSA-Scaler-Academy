import java.util.*;

public class letter_phone {

    private String[] codes = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public String[] letterCombinations(String A) {

        ArrayList<String> res = new ArrayList<>();
        generate(A,res,"");

        String[] arr = new String[res.size()];
        int idx = 0;

        for(String str : res){

            arr[idx++] = str;
        }

        return arr;
    }

    private void generate(String str, ArrayList<String> res, String ans){

        if(str.length()==0){

            String temp = new String(ans);
            res.add(temp);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        for(int i=0; i<codes[ch-'0'].length(); i++){

            generate(ros,res,ans+codes[ch-'0'].charAt(i));
        }
    }
}
