import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.next();
        String reverseWords = new StringBuilder(words).reverse().toString();
        if (words.equals(reverseWords)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}