public class Armstrong_Numbers {
    static String armstrongNumber(int n) {
        // code here
        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("Number must be a 3-digit integer.");
        }

        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }

        return sum == originalNumber ? "true" : "false";
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(Armstrong_Numbers.armstrongNumber(n));
    }

}
