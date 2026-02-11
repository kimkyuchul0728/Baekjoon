import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());
        for (int i = 1; i < star + 1; i++) {
            for (int j = star - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = star * 2 - 1 - (i * 2) ; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
