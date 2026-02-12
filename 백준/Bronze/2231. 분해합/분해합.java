import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int size = input.length();
        int N = Integer.parseInt(input);
        int min = 0;
        for (int i = N ; i >= N - (size * 9); i--) {
            int num = i;
            int X = 1;
            for (int j = 0; j < size - 1; j++) {
                X *= 10;
            }
            int sum = i;
            while (X >= 1) {
                sum += num / X;
                num %= X;
                X /= 10;
            }
            if (sum == N) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
