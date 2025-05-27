import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A + B + C != 180) {
            System.out.println("Error");
        } else {
            if (A == 60 && B == 60 && C == 60) {
                System.out.println("Equilateral");
                System.exit(0);
            }
            if (A != B && B != C && C !=A) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}