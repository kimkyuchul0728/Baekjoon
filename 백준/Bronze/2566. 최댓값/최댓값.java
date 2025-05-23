import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[9][9];
        int max = -1;
        int line = 0;
        int num = 0;
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                A[i][j] = scanner.nextInt();
                if (A[i][j] > max) {
                    max = A[i][j];
                    line = i + 1;
                    num = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(line + " ");
        System.out.println(num);
    }
}