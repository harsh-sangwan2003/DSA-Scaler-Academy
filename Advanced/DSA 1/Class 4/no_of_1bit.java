public class no_of_1bit {
    public int numSetBits(int A) {

        int res = 0;

        while(A!=0){

            if((A&1)==1)
            res++;

            A = A>>1;
        }

        return res;
    }
}
