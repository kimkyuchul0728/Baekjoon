import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = M ; i <= N ; i++) {
            if (i < 2) {
                continue;
            }
            int a = 0;
            for (int j = 2 ; j < i ; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            if (a == 0) {
                list.add(i);
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(sum);
        System.out.println(list.get(0));
    }
}