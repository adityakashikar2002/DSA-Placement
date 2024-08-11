public class countof3 {
    public static long countOf3(int N) {
        long count = 0;

        for (int i = 0; i <= N; i++) {
            int current = i;

            // Check each digit of the current number.
            while (current > 0) {
                int digit = current % 10;
                if (digit == 3) {
                    count++;
                }
                current /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 13;
        System.out.println(countOf3(N)); // Output: 2
    }
}
