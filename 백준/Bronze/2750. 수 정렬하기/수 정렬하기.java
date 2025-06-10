import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < N ; i++) {
            int n = scanner.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        for (int i = 0 ; i < N ; i++) {
            System.out.println(list.get(i));
        }
    }
}