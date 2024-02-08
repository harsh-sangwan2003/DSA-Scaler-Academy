import java.util.Arrays;

public class single_number3 {

    private boolean check(int n, int pos){

        if((n&(1<<pos))!=0)
        return true;

        return false;
    }

    public int[] solve(int[] A) {

        int xor = 0;
        for(int val : A)
        xor ^= val;

        int set = 0, unset = 0, pos = 0;

        for(int i=0; i<31; i++){

            if(check(xor,i)){

                pos = i;
                break;
            }
        }

        for(int val : A){

            if(check(val,pos))
            set^=val;

            else
            unset^=val;
        }

        int[] res = new int[2];
        res[0] = set;
        res[1] = unset;
        Arrays.sort(res);

        return res;
    }
}
