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
            int[] arr = new int[27];
            int word = 0;
            for (int j = 0; j < s.length(); j++) {
                int first = j == 0 ? 26 : s.charAt(j-1) - 'a';
                int second = s.charAt(j) - 'a';
                if (first != second) {
                    arr[second]++;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0 && arr[j] != 1) {
                    word++;
                }
            }
            if (word == 0) {
                Num++;
            }
        }
        System.out.println(Num);
    }
}
