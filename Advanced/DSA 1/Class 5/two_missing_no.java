import java.util.Arrays;

public class two_missing_no {

    private boolean check(int n, int pos){

        if((n&(1<<pos))!=0)
        return true;

        return false;
    }

    public int[] solve(int[] A) {

        int xor = 0;

        for(int val : A)
        xor^=val;

        for(int i=1; i<=A.length+2; i++)
        xor^=i;

        int pos = 0;
        for(int i=0; i<31; i++){

            if(check(xor,i)){

                pos = i;
                break;
            }
        }

        int set = 0, unset = 0;

        for(int i=0; i<A.length; i++){

            if(check(A[i],pos))
            set^=A[i];

            else
            unset^=A[i];
        }

        for(int i=1; i<=A.length+2; i++){

            if(check(i,pos))
            set^=i;

            else
            unset^=i;
        }

        int[] res = new int[2];
        res[0] = set; res[1] = unset;
        Arrays.sort(res);

        return res;
    }
}
