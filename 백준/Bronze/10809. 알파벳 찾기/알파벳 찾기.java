import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[26];
        for (int i = 0 ; i < 26 ; i++) {
            ABC[i] = -1;
        }
        String words = scanner.next();
        for (int i = 0 ; i < words.length() ; i++) {
            int a = words.charAt(i) - 97;
            if (ABC[a] == -1) {
                ABC[a] = i;
            }
        }
        for (int i = 0 ; i < 26 ; i++) {
            System.out.print(ABC[i] + " ");
        }
    }
}