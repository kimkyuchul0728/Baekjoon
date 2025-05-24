import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] words = new char[5][15];
        for (int i = 0 ; i < 5 ; i++) {
            String word = scanner.next();
            for (int j = 0 ; j < word.length() ; j++) {
                words[i][j] = word.charAt(j);
            }
        }
        for (int i = 0 ; i < 15 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                if (words[j][i] != 0) {
                    System.out.print(words[j][i]);
                }
            }
        }
    }
}