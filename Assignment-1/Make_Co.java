public class Make_Co-prime_Array
{

    int countCoPrime(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (gcd(arr[i], arr[i + 1]) != 1) {
                count++;
            }
        }

        return count;
    }

    // Helper function to calculate GCD using Euclidean algorithm
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 4, 7, 8, 9};
        int n = arr.length;
        System.out.println(solution.countCoPrime(arr, n));  // Output: 3
    }

}
