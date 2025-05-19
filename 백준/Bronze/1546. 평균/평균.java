import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] examNum = new double[N];
        for (int i = 0 ; i < N ; i++) {
            examNum[i] = scanner.nextInt();
        }
        int high = (int) examNum[0];
        for (int i = 0 ; i < N ; i++) {
            if (high < examNum[i]) {
                high = (int) examNum[i];
            }
        }
        for (int i = 0 ; i < N ; i++) {
                examNum[i] = (examNum[i] / high) * 100;
        }
        double score = 0;
        for (int i = 0 ; i < N ; i++) {
            score += examNum[i];
        }
        System.out.println(score/N);
    }
}
