
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();

        String nu1 = new StringBuilder(num1).reverse().toString();
        String nu2 = new StringBuilder(num2).reverse().toString();

        int a = Integer.parseInt(nu1);
        int b = Integer.parseInt(nu2);

        System.out.println(Math.max(a, b));
    }
}
