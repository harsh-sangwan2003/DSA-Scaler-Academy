public class help {
    public int solve(int A) {

        int res = 0;

        while(A!=0){

            if((A&(1<<0))==1)
            res++;

            A = A>>1;
        }

        return res;
    }
}
