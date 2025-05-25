import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 2;
        int up = 1;
        int result = 0;
        int N = scanner.nextInt();
        for (int i = 0 ; i < N ; i++) {
            result = start + up;
            start = result;
            up *= 2;
        }
        System.out.println(result * result);
    }
}