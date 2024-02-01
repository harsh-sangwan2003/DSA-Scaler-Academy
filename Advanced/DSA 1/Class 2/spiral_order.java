public class spiral_order {
    public int[][] generateMatrix(int A) {

        int count = 0, ne = A*A;
        int minR = 0, minC = 0, maxR = A-1, maxC = A-1;
        int[][] res = new int[A][A];

        while(count<ne){

            for(int c=minC; c<=maxC && count<ne; c++){

                res[minR][c] = (count+1);
                count++;
            }
            minR++;

            for(int r=minR; r<=maxR && count<ne; r++){

                res[r][maxC] = (count+1);
                count++;
            }
            maxC--;

            for(int c=maxC; c>=minC && count<ne; c--){

                res[maxR][c] = (count+1);
                count++;
            }
            maxR--;

            for(int r=maxR; r>=minR && count<ne; r--){

                res[r][minC] = (count+1);
                count++;
            }
            minC++;
        }

        return res;
    }
}
