import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Num = new int[N];
        for (int i = 0; i < N; i++) {
            Num[i] = sc.nextInt();
        }
        int max = Arrays.stream(Num).max().getAsInt();
        int min = Arrays.stream(Num).min().getAsInt();
        System.out.println(min + " " + max);
    }
}
