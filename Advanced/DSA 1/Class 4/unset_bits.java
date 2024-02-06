public class unset_bits {

    private boolean check(long a, int pos){

        if((a&(1<<pos))!=0)
        return true;

        return false;
    }

    public long solve(long A, int B) {

        for(int i=0; i<B; i++){

            if(check(A,i))
            A = A^(1<<i);
        }

        return A;
    }
}
