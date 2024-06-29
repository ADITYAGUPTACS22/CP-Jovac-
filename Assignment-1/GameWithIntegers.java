package assignment1;

import java.util.Scanner;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int remainder = n % 3;

            if (remainder == 0) {
                System.out.println("Second");
            } else {
                if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }

        scanner.close();
    }
}
