public class print {
    public void solve(int A) {

        helper(A);
        System.out.println();
    }

    private void helper(int A){

        if(A==0)
        return;

        helper(A-1);
        System.out.print(A+" ");
    }
}
