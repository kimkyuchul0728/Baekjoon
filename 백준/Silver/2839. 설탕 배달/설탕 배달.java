import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int five = N / 5;
        int result = 0;
        if (N == 4 || N == 7) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = five ; i >= 0 ; i--) {
            for (int j = 0 ; j <= (N / 3) ; j++) {
                if (N - (5 * i) - (3 * j) == 0) {
                    result = i + j;
                }
                if (result != 0) break;
            }
        }
        System.out.println(result);
    }
}