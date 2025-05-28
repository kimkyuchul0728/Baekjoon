import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        Collections.sort(list);
        int a = list.get(2);
        int b = list.get(1);
        int c = list.get(0);
        while (a >= b + c) {
            a--;
        }
        System.out.println(a + b + c);
    }
}