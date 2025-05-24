import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] white = new int[100][100];
        int num = scanner.nextInt();
        int all = 0;
        for (int i = 0 ; i < num ; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x ; j < x + 10 ; j++) {
                for (int k = y ; k < y + 10 ; k++) {
                    white[j][k] = 1;
                }
            }
        }
        for (int i = 0 ; i < 100 ; i++) {
            for (int j = 0 ; j < 100 ; j++) {
                if (white[i][j] == 1) {
                    all += 1;
                }
            }
        }
        System.out.println(all);
    }
}