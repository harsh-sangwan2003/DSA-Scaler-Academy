public class sort_color {

    public int[] sortColors(int[] A) {

        int i = 0, j = 0, k = A.length-1;

        while(i<=k){

            if(A[i]==1)
            i++;

            else if(A[i]==0){

                swap(A,i,j);
                i++;
                j++;
            }

            else{

                swap(A,i,k);
                k--;
            }
        }

        return A;
    }

    public void swap(int[] arr, int x, int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
