import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0 ; i < T ; i++) {
            int pay = scanner.nextInt();
            int quarter = pay / 25;
            int dime = (pay % 25) / 10;
            int nickel = ((pay % 25) % 10) / 5;
            int penny = ((pay % 25) % 10) % 5;
            System.out.print(quarter + " ");
            System.out.print(dime + " ");
            System.out.print(nickel + " ");
            System.out.println(penny);
        }
    }
}