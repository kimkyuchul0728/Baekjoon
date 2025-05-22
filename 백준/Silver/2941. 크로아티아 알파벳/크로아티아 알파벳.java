import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] cro = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        for (String li : cro) {
            if (line.contains(li)) {
                line = line.replace(li, "?");
            }
        }
        System.out.println(line.length());
    }
}