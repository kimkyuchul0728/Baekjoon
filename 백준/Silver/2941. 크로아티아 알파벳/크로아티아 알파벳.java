import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();
        int Num = 0;
        for (int i = 0; i < n; i++) {
            if (input.contains("dz=")) {
                input = input.replaceFirst("dz=", " ");
                Num++;
                i += 2;
            } else if (input.contains("c=") || input.contains("c-") || input.contains("d-")
            || input.contains("lj") || input.contains("nj") || input.contains("s=") || input.contains("z=")) {
                input = input.replaceFirst("c=|c-|d-|lj|nj|s=|z=", " ");
                Num++;
                i++;
            }
        }
        input = input.replace(" ", "");
        System.out.println(input.length() + Num);
    }
}
