
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String english = scanner.nextLine();
        String eng = english.trim();
        if (eng.isEmpty()) {
            System.out.println(0);
        } else {
            String[] i = eng.split(" ");
            System.out.println(i.length);
        }
        
    }
}