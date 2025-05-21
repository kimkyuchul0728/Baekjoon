import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alp = new int[26];
        String li = scanner.nextLine();
        String line = li.toUpperCase(Locale.ROOT);
        for (int i = 0 ; i < li.length() ; i++) {
            char a = line.charAt(i);
            alp[a - 'A']++;
        }
        int max = -1;
        int maxAl = 0;
        for (int i = 0 ; i < alp.length ; i++) {
            if (alp[i] > max) {
                max = alp[i];
                maxAl = i;
            }
        }
        for (int i = 0 ; i < alp.length ; i++) {
            if (alp[i] == max && maxAl != i) {
                System.out.println("?");
                System.exit(0);
            }
        }
        int lastMax = maxAl + 65;
        System.out.println((char) lastMax);
    }
}