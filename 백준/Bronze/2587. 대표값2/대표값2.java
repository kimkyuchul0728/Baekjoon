import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);
        num.add(num5);

        System.out.println((num1 + num2 + num3 + num4 + num5) / 5);

        Collections.sort(num);

        System.out.println(num.get(2));

    }
}