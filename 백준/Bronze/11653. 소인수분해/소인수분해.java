import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = N;
        if (N == 1) {
            System.exit(0);
        }
        for (int i = 2 ; i < N ; i++) {
            if (a % i == 0) {
                a /= i;
                System.out.println(i);
            }
            if (a % i == 0) {
                i--;
            }
        }
        if (a != 1) {
            System.out.println(a);
        }
    }
}