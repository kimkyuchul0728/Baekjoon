import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();
        int result = 0;
        int b = 1;
        for (int i = N.length() - 1 ; i >= 0 ; i--) {
            char ch = N.charAt(i);
            int a = 0;
            if (ch - '0' < 10) {
                a = ch - '0';
            } else {
                a = ch - 'A' + 10;
            }
            result += a * b;
            b *= B;
        }
        System.out.println(result);
    }
}