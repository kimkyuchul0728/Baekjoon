import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}