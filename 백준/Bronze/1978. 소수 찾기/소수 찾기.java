import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            int num = scanner.nextInt();
            int x = 0;
            if (num == 1) {
                continue;
            }
            for (int j = 2 ; j < num ; j++) {
                if (num % j == 0) {
                    x++;
                }
            }
            if (x == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}