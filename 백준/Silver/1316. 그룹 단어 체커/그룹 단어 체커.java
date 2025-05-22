import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            String group = scanner.next();
            if (GroupWords(group)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean GroupWords(String group) {
        boolean[] words = new boolean[26];
        char old = 'A';
        for (int i = 0 ; i < group.length() ; i++) {
            char nw = group.charAt(i);
            int alp = nw - 'a';
            if (old != nw) {
                if (words[alp] == true) {
                    return false;
                }
            }
            words[alp] = true;
            old = nw;
        }
        return true;
    }
}