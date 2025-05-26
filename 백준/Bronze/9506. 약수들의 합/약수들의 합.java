import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int sum = 0;
            if (n == -1) {
                break;
            }
            for (int j = 1 ; j < n ; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            if (sum != n) {
                System.out.print(n + " is NOT perfect.");
            } else {
                System.out.print(n + " =");
                for (int j = 1 ; j < n ; j++) {
                    if (n % j == 0) {
                        if (j == 1) {
                            System.out.print(" 1");
                        } else {
                            System.out.print(" + " + j);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}