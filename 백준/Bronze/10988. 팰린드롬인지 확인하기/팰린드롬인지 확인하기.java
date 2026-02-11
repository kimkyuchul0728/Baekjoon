import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        for (int i = 0; i < st.length() / 2; i++) {
            char A = st.charAt(i);
            char B = st.charAt(st.length() - 1 - i);
            if (A != B) {
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
