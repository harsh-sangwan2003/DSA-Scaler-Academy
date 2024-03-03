public class lucky_numbers {

    public int solve(int A) {

        int count = 0;
        int[] primeDivisors = new int[A + 1];

        for (int i = 2; i <= A; i++) {

            if (primeDivisors[i] == 0) {
                for (int j = i; j <= A; j += i) {
                    primeDivisors[j]++;
                }
            }

            else if (primeDivisors[i] == 2) {

                count++;
            }

        }

        return count;
    }
}
