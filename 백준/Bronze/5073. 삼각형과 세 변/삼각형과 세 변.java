import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(A);
            list.add(B);
            list.add(C);
            Collections.sort(list);
            if (A == 0 && B == 0 && C==0) {
                System.exit(0);
            }
            if (list.get(2) >= list.get(1) + list.get(0)) {
                System.out.println("Invalid");
                continue;
            } else {
                if (A == B && B == C) {
                    System.out.println("Equilateral");
                    continue;
                } else if (A != B && B != C && C != A) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }
            list.clear();
        }
    }
}