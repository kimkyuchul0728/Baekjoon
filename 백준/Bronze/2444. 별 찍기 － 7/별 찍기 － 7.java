import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();
        for (int i = 0 ; i < star ; i++) {
            for (int j = star - i ; j > 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < i + 1 ; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = star - 1 ; i > 0 ; i--) {
            for (int j = star - i ; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = i ; j > 0 ; j--) {
                System.out.print("*");
            }
            for (int j = i - 1 ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}