import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String n = N + "";
        int M = 0;
        for (int i = N - (n.length() * 9) ; i < N ; i++) {
            int m = 0;
            m = i;
            String plus = m + "";
            for (int j = 0 ; j < plus.length() ; j++) {
                m += plus.charAt(j) - '0';
            }
            if (m == N) {
                M = i;
                break;
            }
        }
        System.out.println(M);
    }
}
