import java.util.Scanner;

public class Sum_of_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            if (n < 7) {
               
                System.out.println("NO");
            } else {
                boolean found = false;
                for (int x = 1; x < n && !found; x++) {
                    if (x % 3 == 0) continue;
                    for (int y = x + 1; y < n && !found; y++) {
                        if (y % 3 == 0) continue;
                        int z = n - x - y;
                        if (z > y && z % 3 != 0) {
                            System.out.println("YES");
                            System.out.println(x + " " + y + " " + z);
                            found = true;
                        }
                    }
                }
                if (!found) {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}
