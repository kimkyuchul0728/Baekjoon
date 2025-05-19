import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();
        for (int i = 0 ; i < 10 ; i++) {
            int Num = scanner.nextInt() % 42;
            num.add(Num);
        }
        System.out.println(num.toArray().length);
    }
}