import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < i + 1 ; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            String num = "";
            if (A == 0 && B == 0) {
                break;
            }
            if (A > B && A % B == 0) {
                num = "multiple";
            } else if (A < B && B % A == 0) {
                num = "factor";
            } else {
                num = "neither";
            }
            System.out.println(num);
        }
    }
}