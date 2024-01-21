public class row_column_zero {
    
    public int[][] solve(int[][] A) {

        for (int i = 0; i < A.length; i++) {

            boolean flag = false;
            for (int j = 0; j < A[0].length; j++) {

                if (A[i][j] == 0) {

                    flag = true;
                }
            }

            if (flag) {

                for (int j = 0; j < A[0].length; j++)
                    A[i][j] *= -1;
            }
        }

        for (int j = 0; j < A[0].length; j++) {

            boolean flag = false;
            for (int i = 0; i < A.length; i++) {

                if (A[i][j] == 0) {

                    flag = true;
                }
            }

            if (flag) {

                for (int i = 0; i < A.length; i++)
                    A[i][j] = 0;
            }
        }

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                if (A[i][j] < 0)
                    A[i][j] = 0;
            }
        }

        return A;
    }
}
