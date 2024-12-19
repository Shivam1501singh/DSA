public class intreviev {

    public static long getDataDependenceSum(long n) {
        long totalSum = 0;
        long x = 0;

        // Iterate through all values of x from 0 to n
        while (x <= n) {
            // Find the range of k for which floor(n / k) == x
            long kMin = (x + 1 <= n) ? n / (x + 1) + 1 : n + 1;
            long kMax = (x > 0) ? n / x : n;

            // If kMin <= kMax, we can consider this value of x
            if (kMin <= kMax) {
                totalSum += x;
            }

            x++;
        }
        

        return totalSum;
    }

    public static void main(String[] args) {
        long n = 13;  // Sample Input
        System.out.println(getDataDependenceSum(n));  // Expected Output: 29
    }
}
