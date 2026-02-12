import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 0;
        int y = 0;
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] one = {A, B, C};
        int D = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        int[] two = {D, E, F};
        int n = one[1] * two[0] - one[0] * two[1];
        int dn = one[2] * two[0] - one[0] * two[2];
        y = dn / n;
        int dn2 = one[1] * two[2] - one[2] * two[1];
        x = dn2 / n;
        System.out.println(x + " " + y);
    }
}
