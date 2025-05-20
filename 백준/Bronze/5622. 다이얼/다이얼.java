import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int count = 0;
        for (int i = 0 ; i < num.length() ; i++) {
            char a = num.charAt(i);
            if (a >= 'A' && a <= 'C') {
                count += 3;
            } else if (a >= 'D' && a <= 'F') {
                count += 4;
            } else if (a >= 'G' && a <= 'I') {
                count += 5;
            } else if (a >= 'J' && a <= 'L') {
                count += 6;
            } else if (a >= 'M' && a <= 'O') {
                count += 7;
            } else if (a >= 'P' && a <= 'S') {
                count += 8;
            } else if (a >= 'T' && a <= 'V') {
                count += 9;
            } else {
                count += 10;
            }
        }
        System.out.println(count);
    }
}