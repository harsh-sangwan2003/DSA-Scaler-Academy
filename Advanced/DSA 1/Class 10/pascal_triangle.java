public class pascal_triangle {

    public int[][] solve(int A) {

        int[][] mat = new int[A][A];

        for (int i = 0; i < A; i++) {

            mat[i][0] = 1;
            mat[i][i] = 1;

            for (int j = 1; j < i; j++)
                mat[i][j] = mat[i - 1][j - 1] + mat[i - 1][j];
        }

        return mat;
    }
}
