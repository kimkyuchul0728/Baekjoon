import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i <= N ; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }
        if (list.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(list.get(K - 1));
        }
    }
}