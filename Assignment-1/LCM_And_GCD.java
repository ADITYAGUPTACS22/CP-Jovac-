public class LCM_And_GCD {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[] { lcm, gcd };
    }
    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Long A = 5L;
        Long B = 10L;
        Long[] result = LCM_And_GCD.lcmAndGcd(A, B);
        System.out.print(result[0]+" ");
        System.out.println(result[1]);
    }
}
