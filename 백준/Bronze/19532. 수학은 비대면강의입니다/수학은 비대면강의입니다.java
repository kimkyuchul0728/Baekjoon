import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int z = (b * d) - (e * a);
        int x = (f * b) - (c * e);
        int y = (c * d) - (f * a);

        System.out.print(x / z + " ");
        System.out.print(y / z);

    }
}