public class good_days {

    private boolean check(int a, int pos){

        if((a&(1<<pos))!=0)
        return true;

        return false;
    }

    public int solve(int A) {

        int res = 0;

        while(A!=0){

            if(check(A,0))
            res++;

            A = A>>1;
        }

        return res;
    }
}
