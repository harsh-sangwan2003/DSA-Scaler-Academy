public class nuset_bit {

    private boolean checkBit(int a, int pos){

        if((a&(1<<pos))!=0)
        return true;

        return false;
    }

    public int solve(int A, int B) {

        if(checkBit(A,B))
        A = A^(1<<B);

        return A;
    }
}
