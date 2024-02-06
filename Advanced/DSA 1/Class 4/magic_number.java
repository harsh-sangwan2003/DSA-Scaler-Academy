public class magic_number {
    public int solve(int A) {

        int res = 0, power = 5;

        while(A!=0){

            int rem = A%2;
            A/=2;
            res = res+rem*power;
            power*=5;
        }

        return res;
    }
}
