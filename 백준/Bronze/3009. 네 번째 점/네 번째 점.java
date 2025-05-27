import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = 0;
        int y3 = 0;
        if (x == x1) {
            x3 = x2;
        } else if (x1 == x2) {
            x3 = x;
        } else {
            x3 = x1;
        }
        if (y == y1) {
            y3 = y2;
        } else if (y1 == y2) {
            y3 = y;
        } else {
            y3 = y1;
        }
        System.out.println(x3 + " " + y3);
    }
}