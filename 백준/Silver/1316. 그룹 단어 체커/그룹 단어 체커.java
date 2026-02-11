import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Num = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] alp = new boolean[26];
            boolean cound = true;
            for (int j = 0; j < s.length(); j++) {
                int current = s.charAt(j) - 'a';
                if (alp[current]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        cound = false;
                        break;
                    }
                }
                alp[current] = true;
            }
            if (cound) Num++;
        }
        System.out.println(Num);
    }
}
