import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().toUpperCase();
        int[] Alp = new int[26];
        for (int i = 0; i < st.length(); i++) {
            Alp[st.charAt(i) - 'A']++;
        }
        int maxNum = 0;
        String maxNumStr = "";
        for (int i = 0; i < Alp.length; i++) {
            if (Alp[i] > maxNum) {
                maxNum = Alp[i];
                maxNumStr = String.valueOf((char) (i + 65));
            } else if (Alp[i] == maxNum) {
                maxNumStr = "?";
            }
        }
        System.out.println(maxNumStr);
    }
}
