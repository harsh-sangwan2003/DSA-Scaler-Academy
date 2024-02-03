public class first_missing_integer {
    public int firstMissingPositive(int[] A) {

        int N = A.length+2;
        boolean flag = false;

        for(int i=0; i<A.length; i++){

            if(A[i]<=0)
            A[i] = N+2;

            if(A[i]==1)
            flag = true;
        }

        if(!flag)
        return 1;

        for(int i=0; i<A.length; i++){

            int idx = Math.abs(A[i])-1;

            if(idx>=0 && idx<A.length){

                if(A[idx]>0)
                A[idx]*=-1;
            }
        } 

        for(int i=0; i<A.length; i++){

            if(A[i]>0)
            return i+1;
        }

        return A.length+1;
    }
}
