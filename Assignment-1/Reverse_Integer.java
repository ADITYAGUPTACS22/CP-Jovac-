
public class Reverse_Integer {
    public static int reverse(int y) {
        StringBuilder s = new StringBuilder();
        s.append(Math.abs(y));
        s.reverse();
        if (s.length() >= 10) {
            int a = Integer.parseInt(s.substring(0, 5));
            int b = Integer.parseInt(s.substring(5, 10));
            if (a > 21474 || b > 83647) {
                return 0;
            }
        }

        int num = Integer.parseInt(s.toString());

        return (y < 0) ? -num : num;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
