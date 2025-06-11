import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0 ; i < N ; i++) {
            int score = scanner.nextInt();
            num.add(score);
        }
        num.sort(Collections.reverseOrder());
        System.out.println(num.get(k - 1));
    }
}