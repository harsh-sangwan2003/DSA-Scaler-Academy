public class matrix_search {

    public int searchMatrix(int[][] arr, int tar) {

        int r = 0, c = arr[0].length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == tar)
                return 1;

            else if (arr[r][c] > tar)
                c--;

            else
                r++;
        }

        return 0;
    }
}
