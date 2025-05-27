import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int w1 = w - x;
        int h1 = h - y;
        int a = 0;
        int b = 0;
        if (x >= y) {
            a = y;
        } else {
            a = x;
        }
        if (w1 >= h1) {
            b = h1;
        } else {
            b = w1;
        }
        if (a >= b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
