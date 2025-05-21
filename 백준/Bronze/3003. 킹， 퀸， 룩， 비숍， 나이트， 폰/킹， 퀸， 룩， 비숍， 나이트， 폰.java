import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] chess = new int[6];
        for (int i = 0 ; i < 6 ; i++) {
            chess[i] = scanner.nextInt();
        }
        int[] count = new int[6];
        for (int i = 0 ; i < 2 ; i++) {
            if (chess[i] == 1) {
                count[i] = 0;
            } else if (chess[i] > 1) {
                for (int j = chess[i] ; j > 1 ; j--) {
                    count[i]--;
                }
            } else {
                for (int k = chess[i] ; k < 1 ; k++) {
                    count[i]++;
                }
            }
        }
        for (int i = 2 ; i < 5 ; i++) {
            if (chess[i] == 2) {
                count[i] = 0;
            } else if (chess[i] > 2) {
                for (int j = chess[i] ; j > 2 ; j--) {
                    count[i]--;
                }
            } else {
                for (int k = chess[i] ; k < 2 ; k++) {
                    count[i]++;
                }
            }
        }
        if (chess[5] == 8) {
            count[5] = 0;
        } else if (chess[5] > 8) {
            for (int i = chess[5] ; i > 8 ; i--) {
                count[5]--;
            }
        } else {
            for (int j = chess[5] ; j < 8 ; j++) {
                count[5]++;
            }
        }
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.print(count[5]);
    }
}