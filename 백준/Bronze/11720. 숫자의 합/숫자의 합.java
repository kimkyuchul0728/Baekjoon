import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String num = scanner.next();
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            int x = num.charAt(i) - 48;
            count += x;
        }
        System.out.println(count);
    }
}