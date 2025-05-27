import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int xMax = -10001;
        int yMax = -10001;
        int xMin = 10001;
        int yMin = 10001;
        for (int i = 0 ; i < N ; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x > xMax) {
                xMax = x;
            }
            if (y > yMax) {
                yMax = y;
            }
            if (x < xMin) {
                xMin = x;
            }
            if (y < yMin) {
                yMin = y;
            }
        }
        int X = (xMax - xMin);
        int Y = (yMax - yMin);
        if (X < 0) {
            X *= -1;
        }
        if (Y < 0) {
            Y *= -1;
        }
        System.out.println(X * Y);
    }
}