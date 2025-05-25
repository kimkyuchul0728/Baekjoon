import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long first = 1;
        long result = 0;
        for (int i = 0 ; i < N ; i++) {
            first += 6 * result;
            if (first >= N) {
                System.out.println(i + 1);
                break;
            }
            result++;
        }
    }
}